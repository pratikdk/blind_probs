import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;

public class Test27 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int[] arr2 = new int[2];
        List<Double> arr3 = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();
        Set<String> set = new HashSet<>();
        Queue<String> queue = new LinkedList<>();
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());


        String s = "HEllo my friend";
        String[] words = s.split(" ");
        String s2 = s.replaceAll("\\ ", "|");
        System.out.println(Arrays.toString(words));
        System.out.println(s2);

        List<Integer> l1 = new ArrayList<>(Arrays.asList(10, 2, 501, 123));
        System.out.println(Collections.max(l1));
        
    }
}
