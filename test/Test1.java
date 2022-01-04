import java.util.ArrayList;
import java.util.List;

public class Test1 {

    public static void recur(int[] arr, int target, int cSum, List<Integer> currList, List<List<Integer>> res) {
        if (cSum > target) return;
        if (cSum == target) {
            res.add(new ArrayList<>(currList)); // clone
        }
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            cSum += arr[i];
            currList.add(arr[i]);
            recur(arr, target, cSum, currList, res);
            cSum -= arr[i];
            currList.remove(currList.size()-1);
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int target = 4;
        List<List<Integer>> res = new ArrayList<>();
        recur(arr, target, 0, new ArrayList<>(), res);
        System.out.println(res);
    }
}