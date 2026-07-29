import java.util.*;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int need =0;
        HashMap<Integer,Integer>map= new HashMap<>();
        for (int i =0;i<nums.length;i++){
            need = target -nums[i];
            if(map.containsKey(need)){
                return new int[]{map.get(need), i};
            }
             map.put(nums[i], i);
        }
        return new int[]{};
    }
}