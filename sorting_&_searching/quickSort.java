import java.util.Scanner;

public class quickSort {

    public static void qs(int arr[],int p,int r){
        if(p<r){
            int q = pivot(arr,p,r);
            qs(arr,p,q-1);
            qs(arr,q+1,r);
        }
    }



    public static int pivot(int arr[],int p,int r){
        int x = arr[r];
        int i = p-1;
        for(int j = p; j<r; j++){
            if(arr[j]<=x){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = arr[r];
        arr[r] = temp;
        return i;
    }

    public static void printArray(int arr[], int n) {
        for (int i = 0; i<n; i++) {
            System.out.print(" " + arr[i]);
        }
    }
    
    public static void main(String[] args) {
        int size;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        size = sc.nextInt();
        int arr[] = new int[size];
        System.out.print("Enter elements : ");
        for (int i = 0; i <size; i++) {
            arr[i] = sc.nextInt();
        }
        int p = 0;
        qs(arr, p, size-1);
        System.out.print("Sorted array: ");
        printArray(arr,size);
        sc.close();
    }
}
