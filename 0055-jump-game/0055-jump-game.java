class Solution {
    public boolean canJump(int[] nums) {
        int maxReach=0;
        int reach =0;
        for (int i = 0;i<nums.length;i++){
            if(i>maxReach){
                return false;
            }
            reach = i+nums[i];
            if(reach>maxReach){
                maxReach=reach;
            }
            
        }
        return true;
        
    }
}