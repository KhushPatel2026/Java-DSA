
import java.util.Arrays;
import java.util.Scanner;

public class insertionSort {

    public static void iS(int []arr){
        for(int i = 1;i<arr.length;i++){
            int j = i;
            while(arr[j-1]>arr[j] && j>0){
                int temp = arr[j-1];
                arr[j-1]=arr[j];
                arr[j]=temp;
            }
        }
    }
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        System.out.print("Enter the array element : ");
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        iS(arr);

        System.out.println("Sorted array is : ");
        System.out.println(Arrays.toString(arr));

        sc.close();
    }
    
}
