class Solution {
    public int jump(int[] nums) {
        int maxReach = 0;
        int reach = 0;
        int jump =0;
        int end=0;
        for(int i =0 ;i<nums.length-1;i++){
            reach = i+nums[i];
            if(reach>maxReach){
                maxReach = reach;
            }
                if(i==end){
                    jump++;
                    end=maxReach;
                }
            }
        
        return jump;
    }
}