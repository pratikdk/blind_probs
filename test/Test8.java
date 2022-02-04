import java.util.Arrays;

public class Test8 {
    public static void main(String[] args) {
        int[] arr = {10,9,2,5,3,7,101,18};
        int[] arr2 = {2, 1, 0};
        int[] dp = new int[arr2.length];
        dp[0] = 10;
        System.out.println(Arrays.binarySearch(dp, 0, 1, 2));
        //System.out.println(Arrays.binarySearch(arr, 10));
    }
}
