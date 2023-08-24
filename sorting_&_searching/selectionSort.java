
import java.util.Arrays;
import java.util.Scanner;

public class selectionSort {

    public static void sS(int arr[]){
        for(int i = 0;i<arr.length;i++){
            int min_idx = i;
            for(int j =i+1;j<arr.length;j++){
                if(arr[j] < arr[min_idx]){
                    min_idx = j;
                }
            }

            if(min_idx != i){
                int temp = arr[i];
                arr[i] = arr[min_idx];
                arr[min_idx] = temp;
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

        sS(arr);

        System.out.println("Sorted array is : ");
        System.out.println(Arrays.toString(arr));

        sc.close();
    }
}