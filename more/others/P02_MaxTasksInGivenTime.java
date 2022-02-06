import java.util.Comparator;

// https://leetcode.com/discuss/interview-question/1194238/paypal-max-tasks-that-can-be-completed-in-given-budget

import java.util.*;

public class P02_MaxTasksInGivenTime {

    public static int solve(int n, int t, int[][] tasks) {
        Arrays.sort(tasks, new Comparator<int[]>() { // (tasks, (a, b) -> Integer.compare(a[0], b[0]))
            @Override
            public int compare(int[] o1, int[] o2) {
                return Integer.compare(o1[0], o2[0]); // a - b
            }
        });
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        int maxTaskCount = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += tasks[i][1];
            maxHeap.add(tasks[i][1]);
            int time = 2 * tasks[i][0];
            while (!maxHeap.isEmpty() && (sum+time) > t) { // crossed threshold // location([i][0]) also matters
                sum -= maxHeap.peek();
                maxHeap.poll();
            }
            maxTaskCount = Math.max(maxTaskCount, maxHeap.size());
        }

        return maxTaskCount;
    }
    public static void main(String[] args) {
        System.out.println(solve(4, 12, new int[][]{{3, 10}, {2, 10}, {1, 10},{4, 10}}));
        System.out.println(solve(3, 16, new int[][]{{2, 8}, {4, 5}, {5, 1}}));
    }
        
}