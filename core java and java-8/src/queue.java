import java.util.Deque;
import java.util.ArrayDeque;


public class queue {
    public static void main(String[] args){
        Deque<Integer> queue = new ArrayDeque<>();


        queue.offer(10);
        queue.offer(20);
        System.out.println(queue);
        System.out.println(queue.peek());
        queue.poll();
        System.out.println(queue);
    }

}
