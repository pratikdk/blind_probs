public class Test18 {
    public static int maxSubarraySol(int[] nums) {
        int curr = nums[0];
        int max = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (curr <= 0) {
                curr = 0;
            }
            curr += nums[i];
            max = Math.max(max, curr);
        }

        return max;
    }

    public static int maxSubarraySol2(int[] nums) {
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        int max = dp[0];

        for (int i = 1; i < nums.length; i++) {
            if (dp[i-1] > 0) {
                dp[i] = dp[i-1];
            }
            dp[i] += nums[i];
            max = Math.max(max, dp[i]);
        }

        return max;
    }

    public static void main(String[] args) {
        int[][] probs = {
            {-2,1,-3,4,-1,2,1,-5,4},
            {1},
            {-1},
            {5,4,-1,7,8}
        }; 
        for (int[] prob: probs) {
            // System.out.println(maxSubarraySol(prob));
            System.out.println(maxSubarraySol2(prob));
        }
    }
}
