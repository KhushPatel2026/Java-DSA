package Stack;
import java.util.Scanner;
import java.util.Stack;

public class rectangleInHistogram {
    public static int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int prevsmall[] = new int[n];
        int nextsmall[] = new int[n];
        Stack<Integer> s =new Stack<>();

        for(int i=0;i<heights.length;i++){
            while(!s.isEmpty() && heights[s.peek()] >= heights[i]){
                s.pop();
            }
            if(s.isEmpty()){
                prevsmall[i] = -1;
            }
            else{
                prevsmall[i] = s.peek();
            }
            s.push(i);
        }

        s = new Stack<>();


       for(int i=heights.length-1;i>=0;i--){
            while(!s.isEmpty() && heights[s.peek()] >= heights[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nextsmall[i] = heights.length;
            }
            else{
                nextsmall[i] = s.peek();
            }
            s.push(i);
        }

        int maxarea = 0;

        for(int i=0;i<heights.length;i++){
            int width = nextsmall[i]-prevsmall[i]-1;
            int area = heights[i] * width;
            maxarea = Math.max(area, maxarea);
        }

        return maxarea;
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter no of Data: ");
        n = sc.nextInt();
        int height[] = new int[n];
        System.out.print("Enter Data: ");
        for(int i = 0;i<n;i++){
            height[i] = sc.nextInt();
        }
        int ans = largestRectangleArea(height);
        System.out.println("Max area: "+ans);
        sc.close();
    }
}
