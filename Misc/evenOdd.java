import java.util.Scanner;

public class evenOdd{

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
    
    public static void swap(int[] arr,int x,int y){
        int temp = arr[x];
        arr[x]=arr[y];
        arr[y]=temp;
    }

    public static void printArray(int []arr){
        int n = arr.length;
        for(int i=0;i< n;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void sortArray(int []arr){
        int n = arr.length;
        int left=0;
        int right=n-1;
        while (left < right) {
            while (arr[left] % 2 == 0 && left < right) {
                left++;
            }
            while (arr[right] % 2 == 1 && left < right) {
                right--;
            }
            if (left < right){
                swap(arr, left, right);
            }
        }
    }
    public static void main(String[] args) {
        System.out.print("Enter array size : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr= new int[n];
        System.out.print("Enter arrays : ");
        for(int i=0;i < n;i++){
            arr[i] = sc.nextInt();
        }
        sortArray(arr);
        System.out.print("Sorted arrays : ");
        printArray(arr);
        sc.close();
    }
}
