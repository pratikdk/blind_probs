public class P33_SearchInRotatedSortedArray1Distinct {

    public static int search(int[] nums, int target) {
        int left = 0, right = nums.length-1;
        int mid = 0;
        while (left <= right) {
            mid = (left+right)/2;
            if (nums[mid] == target) {
                return mid;
            }
            if (nums[left] <= nums[mid]) { // first half is sorted
                if (nums[left] <= target && target < nums[mid]) { // if within sorted bounds
                    right = mid-1;
                } else { // explore other half
                    left = mid+1;
                }
            } else { // second half is sorted
                if (nums[mid] < target && target <= nums[right]) { // if within sorted bounds
                    left = mid+1;
                } else { // explore other half
                    right = mid-1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[][][] probs = {
            {{4,5,6,7,0,1,2}, {0}},
            {{4,5,6,7,0,1,2}, {3}},
            {{3,4,5,1,2}, {4}},
            {{4,5,6,7,0,1,2}, {6}},
            {{11,13,15,17}, {15}}
        };
        for (int[][] prob: probs) {
            System.out.println(search(prob[0], prob[1][0]));
        }
    }
}
