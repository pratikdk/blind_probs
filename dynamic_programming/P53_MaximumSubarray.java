public class P53_MaximumSubarray {

    public static int maxSubArray_sol1(int[] nums) {
        int max = nums[0];
        int currSum = max;
        for (int i = 1; i < nums.length; i++) {
            if (currSum <= 0) {
                currSum = 0;
            }
            currSum += nums[i];
            max = Math.max(max, currSum); 
        }
        return max;
    }

    // dp
    public static int maxSubArray_sol2(int[] nums) {
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        int max = dp[0];
        for (int i = 1; i < nums.length; i++) {
            dp[i] = nums[i] + (dp[i-1] <= 0 ? 0 : dp[i-1]);
            max = Math.max(max, dp[i]);
        }
        return max;
    }

    // public static int maxSubArray(int[] nums) {
    //     int max = nums[0];
    //     int cSum = max;
    //     for (int i = 0, j = 1; j < nums.length; j++) {
    //         if (cSum < 0) {
    //             i++;
    //             cSum = 0;
    //         }
    //         cSum += nums[j];
    //         max = Math.max(max, cSum);
    //     }
    //     return max;
    // }

    // // public static int maxSubArray(int[] nums) {
    // //     int max = Integer.MIN_VALUE;
    // //     int cSum = max;
    // //     for (int i = -1, j = 0; j < nums.length; j++) {
    // //         if (cSum < 0) {
    // //             i++;
    // //             cSum = 0;
    // //         }
    // //         cSum += nums[j];
    // //         max = Math.max(max, cSum);
    // //     }
    // //     return max;
    // // }

    public static void main(String[] args) {
        int[][] probs = {
            {-2,1,-3,4,-1,2,1,-5,4},
            {1},
            {-1},
            {5,4,-1,7,8}
        }; 
        for (int[] prob: probs) {
            // System.out.println(maxSubArray_sol1(prob));
            System.out.println(maxSubArray_sol2(prob));
        }
    }
}
