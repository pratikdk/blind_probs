public class P744_FIndSmallestLetterGreaterThanTargetCyclic {
    public static int nextGreatestNumber(int[] nums, int target) {
        int left = 0, right = nums.length-1;
        int mid = 0;
        while (left < right) {
            mid = (left + right) / 2;
            if (nums[mid] > nums[mid+1] && target > nums[mid]) {
                return nums[mid+1];
            }
            if (nums[left] <= nums[mid]) {
                if (nums[left] <= target && target <= nums[mid]) {
                    right = mid;
                } else {
                    left = mid+1;
                }
            } else {
                if (nums[mid+1] <= target && target <= nums[right]) {
                    left = mid+1;
                } else {
                    right = mid;
                }
            }
        }
        return nums[(left+1) % nums.length];
    }
    public static void main(String[] args) {
        int[][][] probs = {
            {{7, 9, 10, 11, 2, 4, 5}, {12}}, // 2
            {{0, 1, 2, 3, 4}, {8}}, // 0
            {{6, 1, 3, 4}, {9}}, // 1
        };
        for (int[][] prob: probs) {
            System.out.println(nextGreatestNumber(prob[0], prob[1][0]));
        }
    }
}
