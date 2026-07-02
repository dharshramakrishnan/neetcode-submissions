class Solution {
    public int missingNumber(int[] nums) {
       Map<Integer,Integer> mpp= new HashMap<>();

       for(int i=0;i<nums.length;i++)
       {
        mpp.put(nums[i],i);
       }

       int i=0;
       int n=nums.length;
       for(;i<=n;i++)
       {
         if(!mpp.containsKey(i))
         break;

       }
       return i;
    }
}
