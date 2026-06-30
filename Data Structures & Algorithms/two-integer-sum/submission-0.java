class Solution {
    public int[] twoSum(int[] nums, int target) {
        

    

        Map<Integer,Integer> mpp=new HashMap<>();
        for(int k=0;k<nums.length;k++)
        {
       
       
          int num=target-nums[k];
          if(mpp.containsKey(num))
          {
              
           int a=k;
           int b=mpp.get(num);

           if(a>b) return new int[] {mpp.get(num),k};

           return new int[] {k,mpp.get(num)};
              
          }
          else
          {
            mpp.put(nums[k],k);
          }
        }

        return new int[] {};

    }
}
