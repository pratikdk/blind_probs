import java.util.Arrays;

public class P62_UniquePaths {

    public static int uniquePaths(int m, int n) {
        int[] dp = new int[n];
        Arrays.fill(dp, 1);
        int l = 1;
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                int ijWays = l + dp[j];
                dp[j] = ijWays;
                l = ijWays;
            }
            l = 1;
        }
        return dp[n-1]; // last cell
    }
    public static void main(String[] args) {
        int[][] probs = {
            {3, 2},
            {7, 3},
            {3, 3},
            {1, 1}
        };
        for (int[] prob: probs) {
            System.out.println(uniquePaths(prob[0], prob[1]));
        }
    }
}
