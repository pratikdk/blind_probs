public class P42_TrapRainWater {

    public static int trap(int[] height) {
        int n = height.length;
        int left = 0, right = n-1;
        int res = 0;
        int maxLeft = 0, maxRight = 0;
        while (left <= right) {
            if (height[left] <= height[right]) {
                if (height[left] >= maxLeft) maxLeft = height[left];
                else res += maxLeft - height[left];
                left++; 
            } else {
                if (height[right] >= maxRight) maxRight = height[right];
                else res += maxRight - height[right];
                right--;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int[][] probs = { 
            {0,1,0,2,1,0,1,3,2,1,2,1},
            {4,2,0,3,2,5}
        };
        for (int[] prob: probs) {
            System.out.println(trap(prob));
        }
    }
}
