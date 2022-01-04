public class P55_JumpGame {

    public static boolean canJump(int[] nums) {
        int i = 0;
        for (int reach = 0; i < nums.length && i <= reach; i++) {
            reach = Math.max(reach, i + nums[i]);
        }
        return i == nums.length;
    }

    public static void main(String[] args) {
        int[][] probs = {
            {2,3,1,1,4},
            {3,2,1,0,4}
        };
        for (int[] prob: probs) {
            System.out.println(canJump(prob));
        }
    }
}
