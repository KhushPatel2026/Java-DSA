package Stack;
import java.util.Scanner;
import java.util.Stack;

public class queueUsingStack{
    
    public static void main(String[] args) {
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements: ");
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            int x = sc.nextInt();
            s1.push(x);
        }
        for(int i=0;i<n;i++){
            int x = sc.nextInt();
            s2.push(x);
        }

    }



}