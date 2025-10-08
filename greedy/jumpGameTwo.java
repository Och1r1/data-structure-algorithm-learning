public class jumpGameTwo {
    public int jump(int[] nums) {
        int jumps = 0;
        int coverage = 0;
        int maxIndex = 0;
        int finalDestination = nums.length - 1;

        for(int i = 0; i < finalDestination; i++){
            coverage = Math.max(nums[i] + i, coverage);

            if(maxIndex == i){
                jumps++;
                maxIndex = coverage;

                if(coverage >= finalDestination){
                    return jumps;
                }
            }
        }
    
        return jumps;
    }
}
