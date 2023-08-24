package Stack;
import java.util.Scanner;
import java.util.Stack;

public class queueUsingStack{
    
    static Stack<Integer> s1 = new Stack<>();
    static Stack<Integer> s2 = new Stack<>();
    
    void enQueue(int data){
        s1.push(data);
    }

    int deQueue(){
        int n;
        if(s1.empty() && s2.empty()){
            System.out.println("Empty");
            System.exit(0);
        }

        if(s2.empty()){
            while(!s1.empty()){
                n = s1.pop();
                s2.push(n);
            }
        }
        n = s2.pop();
        return n;
    }
    public static void main(String[] args) {
        queueUsingStack q = new queueUsingStack();
        q.enQueue(1);
        q.enQueue(2);
        q.enQueue(3);
        q.enQueue(4);

        System.out.println("Deleted element: "+q.deQueue());
        
    }
}