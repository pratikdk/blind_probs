import java.util.ArrayList;
import java.util.List;

// 1 -> n, no negatives
public class P448_FindAllMissingNumbers {

    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> res = new ArrayList<Integer>();

        for (int i = 0; i < nums.length; i++) {
            nums[Math.abs(nums[i])-1] = -1 * Math.abs(nums[Math.abs(nums[i])-1]);
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) { // its missing
                res.add(i+1);
            }
        }

        return res;
    }


    public static void main(String[] args) {
        int[][] probs = {
            {4,3,2,7,8,2,3,1},
            {1,1}
        };
        for (int[] nums: probs) {
            System.out.println(findDisappearedNumbers(nums));
        }
    }
}
