package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class stackUsingQueue {
    static Queue<Integer> q1 = new LinkedList<>();
    static Queue<Integer> q2 = new LinkedList<>();

    void add(int data){
  
        while(!q1.isEmpty()){
            q2.add(q1.peek());
            q1.poll();
        }
        
        q1.add(data);

        while(!q2.isEmpty()){
            q1.add(q2.peek());
            q2.poll();
        }
    }

    int remove(){
        if(q1.isEmpty()){
            System.out.println("Stack underflow");
            System.exit(0);
        }

        int ele = q1.peek();
        q1.poll();
        return ele;

    }
    public static void main(String[] args){
        stackUsingQueue s = new stackUsingQueue();
 
        s.add(2);
        s.add(5);
        s.add(7);
        s.add(10);

        System.out.println("Deleted element is: "+s.remove());
        System.out.println("Deleted element is: "+s.remove());

    }
    
}
