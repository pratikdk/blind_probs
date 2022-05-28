import java.util.*;

public class Test22 {
    public static int solution(int[] A) {
        // write your code in Java SE 11
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int a: A) {
            if (a > 0) {
                pq.add(a);
            }
        }
        System.out.println(pq);
        Integer priorElement = pq.poll();
        while (!pq.isEmpty()) {
            int currElement = pq.poll();
            if (currElement-priorElement > 1) {
                return priorElement+1;
            }
            priorElement = currElement;
        }

        return (priorElement != null) ? priorElement+1 : 1;
    }
    public static void main(String[] args) {
        // int[][] probs = {
        //     {1, 3, 6, 4, 1, 2},
        //     {1, 2, 3},
        //     {-1, -3}
        // };

        // for (int[] prob: probs) {
        //     System.out.println(solution(prob));
        // }

        // int[] arr = {1, 3, 6, 4, 1, 2};
        // PriorityQueue<Integer> pq = new PriorityQueue<>();
        // for (int a : arr) {
        //     pq.add(a);
        // }
        // while (!pq.isEmpty()) {
        //     System.out.println(pq.poll());
        // }
        
    }
}

// int N = A.length;
// Set<Integer> set = new HashSet<>();
// for (int a : A) {
//     if (a > 0) {
//         set.add(a);
//     }
// }
// for (int i = 1; i <= N + 1; i++) {
//     if (!set.contains(i)) {
//         return i;
//     }
// }