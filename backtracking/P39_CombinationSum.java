import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// https://leetcode.com/problems/combination-sum/discuss/16502/A-general-approach-to-backtracking-questions-in-Java-(Subsets-Permutations-Combination-Sum-Palindrome-Partitioning)

/*** With Repetition ***/
public class P39_CombinationSum {

    public static List<List<Integer>> combinationSum(int[] nums, int target) {
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
                tempList.add(nums[i]);
                backtrack(list, tempList, nums, target-nums[i], i);
                tempList.remove(tempList.size()-1);
            }
        }
    }

    public static void main(String[] args) {
        int[][][] probs = {
            {{2,3,6,7}, {7}},
            {{2,3,5}, {8}},
            {{2}, {1}}
        };
        for (int[][] prob: probs) {
            System.out.println(combinationSum(prob[0], prob[1][0]));
        }
    }
}
