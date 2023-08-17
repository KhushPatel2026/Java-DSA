public class LinkedList {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    public void insertAtEnd(int newData) {
        Node newNode = new Node(newData);
        if (head == null) {
            head = new Node(newData);
            return;
        }

        newNode.next = null;
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
        return;
    }

    public int check(int target) {
        int flag = 0;
        Node temp = head;
        while (temp.next != null) {
            if (temp.data == target) {
                flag = 1;
            }
            temp = temp.next;
        }

        return flag;
    }

    public void insertAtFront(int newData) {
        Node newNode = new Node(newData);
        newNode.next = head;
        head = newNode;
    }

    public void insertAfter(int pos, int newData) {
        if (pos < 0) {
            System.out.println("Error");
            return;
        }

        Node newNode = new Node(newData);
        if (head == null) {
            head = new Node(newData);
            return;
        }

        Node temp = head;
        int i = 0;
        while (i != pos) {
            temp = temp.next;
            i++;
        }

        newNode.next = temp.next;
        temp.next = newNode;

    }

    public void middle() {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        System.out.println("Middle node : " + slow.data);
    }

    public void insertAtMiddle(int newData, int pos) {

        if (pos < 0) {
            System.out.println("Error");
            return;
        }

        Node temp = head;
        Node newNode = new Node(newData);

        if (pos == 0) {
            head = temp.next;
            return;
        }

        int i = 1;
        while (i != pos) {
            temp = temp.next;
            i++;

        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public void delete(int pos) {

        if (pos < 0) {
            System.out.println("Error");
            return;
        }

        Node temp = head;

        if (pos == 0) {
            head = temp.next;
            return;
        }

        int i = 1;
        while (i != pos) {
            temp = temp.next;
            i++;
        }

        temp.next = temp.next.next;

    }

    public void reverseI() {
        Node temp = head;
        Node prev = null;
        Node nextptr = null;

        while (temp != null) {
            nextptr = temp.next;
            temp.next = prev;
            prev = temp;
            temp = nextptr;
        }

        head = prev;
        return;
    }

    public void detectLoop() {
        Node slow = head;
        Node fast = head;
        int flag = 0;
        while (fast != null && fast.next != null && slow != null) {
            if (slow == fast) {
                flag = 1;
                break;
            }
        }

        if (flag == 0) {
            System.out.println();
        }
    }

    public void reverseR(Node temp, Node prev) {
        if (temp.next == null) {
            head = temp;
            temp.next = prev;
            return;
        }

        Node nextptr = temp.next;
        temp.next = prev;
        reverseR(nextptr, temp);
    }

    public void displayLL() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertAtEnd(2);
        list.insertAtEnd(3);
        list.insertAtEnd(4);

        list.displayLL();
        System.out.println();
        list.insertAtFront(1);
        list.insertAfter(2, 10);
        list.insertAtEnd(5);
        list.displayLL();

        System.out.println();
        list.delete(5);
        list.displayLL();

        System.out.println();
        list.reverseI();
        list.displayLL();

        System.out.println();
        list.reverseR(list.head, null);
        list.displayLL();

        list.middle();
    }

}
