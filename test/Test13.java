import java.util.ArrayDeque;
import java.util.Deque;

public class Test13 {
    public static void main(String[] args) {
        Deque<Integer> q = new ArrayDeque<>();
        q.offer(1);
        q.offer(2);
        q.offer(3);
        q.offer(4);
        System.out.println(q);
        System.out.println(q.peek());
        System.out.println(q.peekLast());
        System.out.println(q.poll());
    }
}
