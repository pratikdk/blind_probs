import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// https://leetcode.com/problems/combination-sum/discuss/16502/A-general-approach-to-backtracking-questions-in-Java-(Subsets-Permutations-Combination-Sum-Palindrome-Partitioning)


public class P40_CombinationSum2 {

    public static List<List<Integer>> combinationSum2(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();
        backtrack(list, new ArrayList<>(), nums, target, 0);
        return list;
    }

    private static void backtrack(List<List<Integer>> list, List<Integer> tempList, int[] nums, int target, int start) {
        if (target < 0) return;
        else if (target == 0) list.add(new ArrayList<>(tempList));
        else {
            for (int i = start; i < nums.length; i++) {
                if (i > start && nums[i] == nums[i-1]) continue;
                tempList.add(nums[i]);
                backtrack(list, tempList, nums, target-nums[i], i+1);
                tempList.remove(tempList.size()-1);
            }
        }
    }

    public static void main(String[] args) {
        int[][][] probs = {
            {{10,1,2,7,6,1,5}, {8}},
            {{2,5,2,1,2}, {5}},
            {{2}, {1}}
        };
        for (int[][] prob: probs) {
            System.out.println(combinationSum2(prob[0], prob[1][0]));
        }
    }
}
