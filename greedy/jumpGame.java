public class jumpGame {
    public static boolean canJump(int[] nums) {
        int goal_index = nums.length - 1;
        for(int i = goal_index - 1; i >= 0; i--){
            if(nums[i] + i >= goal_index){
                goal_index = i;
            }
        }

        if(goal_index == 0){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,0,1,0};
        System.out.println(canJump(nums));
    }
}
