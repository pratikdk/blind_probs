import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 1 -> n, no negatives
public class P442_FindAllDupllicates {

    public static List<Integer> findDuplicates(int[] nums) {
        List<Integer> res = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i])-1;
            if (nums[index] < 0) {
                res.add(index+1);
            }
            nums[index] = -1 * Math.abs(nums[index]);
        }
        System.out.println(">>> " + Arrays.toString(nums));

        return res;
    }

    public static void main(String[] args) {
        int[][] probs = {
            {4,3,2,7,8,2,3,1},
            {1,1,2},
            {1}
        };
        for (int[] prob: probs) {
            System.out.println(findDuplicates(prob));
        }
    }
}
