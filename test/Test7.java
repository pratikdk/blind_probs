import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Test7 {

    
    static class Path {
        int prev, value, next;
        public Path(int prev, int next, int value) {
            this.prev = prev;
            this.value = value;
            this.next = next;
        }
    }
    
    public static void main(String[] args) {
        PriorityQueue<Path> priorityQueue = new PriorityQueue<>(new Comparator<Path>() {
            @Override
            public int compare(Path p1, Path p2) {
                if (p1.value < p2.value) {
                    return -1;
                } else if (p1.value > p2.value) {
                    return 1;
                } else {
                    return 0;
                }
            }
        });
        priorityQueue.add(new Path(0, 1, 10));
        priorityQueue.add(new Path(0, 1, 20));
        System.out.println(priorityQueue.peek().value);
        
        PriorityQueue<Integer> p2 = new PriorityQueue<>(); // default min heap
        p2.add(10);
        p2.add(20);
        System.out.println(p2.peek());
    }
}
