import java.util.Scanner;

public class mergeSort {
    public static void Merge(int arr[], int p, int r) {
        if (p >= r) {
            return;
        }

        int q;
        q = p + (r - p) / 2;
        Merge(arr, p, q);
        Merge(arr, q + 1, r);
        MergeSort(arr, p, q, r);
    }

    public static void MergeSort(int arr[], int p, int q, int r) {
        int n1 = p;
        int n2 = q + 1;
        int k = 0;
        int arrNew[] = new int[r - p + 1];
        while (n1 <= q && n2 <= r) {
            if (arr[n1] <= arr[n2]) {
                arrNew[k++] = arr[n1++];
            } else {
                arrNew[k++] = arr[n2++];
            }
        }
        while (n1 <= q) {
            arrNew[k++] = arr[n1++];
        }
        while (n2 <= r) {
            arrNew[k++] = arr[n2++];
        }
        for (int i = 0; i < arrNew.length; i++) {
            arr[p + i] = arrNew[i];
        }
    }

    public static void printArray(int arr[], int n) {
        for (int i = 0; i < n; i++) {
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
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int p = 0;
        Merge(arr, p, size - 1);
        printArray(arr,size);
        sc.close();
    }
}
