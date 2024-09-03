package Queue;
import java.util.LinkedList;
import java.util.Queue;

public class Basic {

    public static void main(String[] args) {
        Queue<Integer>queue=new LinkedList<>();
        queue.add(10);
        queue.offer(20);
        queue.add(30);
        System.out.println(queue);//[10,20,30]
        System.out.println(queue.peek());//10
        System.out.println(queue.poll());//10

        
    }
    
}
