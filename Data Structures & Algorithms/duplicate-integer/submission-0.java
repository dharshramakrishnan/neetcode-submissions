class Solution {
    public boolean hasDuplicate(int[] nums) {
        
     Map<Integer,Integer> mpp= new HashMap<>();
     for(int i=0;i<nums.length;i++)
     {
        if(!mpp.containsKey(nums[i]))
        {
            mpp.put(nums[i], mpp.getOrDefault(nums[i],0)+1);
        }
        else
        {
            return true;
        }
     }
return false;
        
    }
}