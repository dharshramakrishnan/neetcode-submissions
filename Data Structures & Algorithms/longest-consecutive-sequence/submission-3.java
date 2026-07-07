class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==1) return 1;
        Arrays.sort(nums);
        int max_length=0;
        int length=1;

        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]==nums[i-1]+1 && nums[i]!=nums[i-1] )
            {
                length++;
            }
          // else  if(nums[i]==nums[i-1]) continue;


           else if(nums[i]!=nums[i-1] && nums[i]!=nums[i-1]+1)
           length=1;

           max_length=Math.max(max_length,length);

            
        }
        return max_length;
    }
}
