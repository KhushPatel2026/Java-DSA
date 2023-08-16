import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        Scanner sc = new Scanner(System.in);
        int n;
        int x;
        System.out.print("Please enter number of times : ");
        n = sc.nextInt();
        System.out.println("Enter data of node : ");
        for (int i = 1; i <= n; i++) {
            x = sc.nextInt();
            list.insertAtEnd(x);
        }
        System.out.println();
        System.out.println("Enter pointer and value : ");
        int pos = sc.nextInt();
        int value = sc.nextInt();
        list.insertAtMiddle(value, pos);
        list.displayLL();

        sc.close();
    }
}
