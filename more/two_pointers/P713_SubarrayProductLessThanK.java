public class P713_SubarrayProductLessThanK {
    public static int numSubArrayProductLessThanK(int[] nums, int k) {
        int count = 0;
        int product = 1;
        for (int i = 0, j = 0; j < nums.length; j++) {
            product *= nums[j];
            while (i <= j && product >= k) {
                product /= nums[i];
                i++;
            }
            count += (j-i+1);
        }
        return count;
    }

    public static void main(String[] args) {
        int[][][] probs = {
            {{10,5,2,6}, {100}},
            {{1,2,3}, {0}}
        };
        for (int[][] prob: probs) {
            System.out.println(numSubArrayProductLessThanK(prob[0], prob[1][0]));
        }
    }
}