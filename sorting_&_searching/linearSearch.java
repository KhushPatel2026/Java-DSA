import java.util.Scanner;

public class linearSearch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements: ");
        int n = sc.nextInt();

        System.out.println("Enter target element: ");
        int target = sc.nextInt();
        int idx = -1;

        System.out.println("Enter the array element");
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] == target) {
                idx = i;
            }
        }

        if (idx == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index: " + idx);
        }

        sc.close();
    }

}
