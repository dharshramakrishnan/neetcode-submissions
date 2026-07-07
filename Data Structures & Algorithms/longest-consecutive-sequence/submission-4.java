class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set= new HashSet<>();

        int max_length=0;
        int length=0;

        for(int num : nums)
        {
            set.add(num);
        }

        for(int num: set)
        {
            if(!set.contains(num-1))
            {
                length=1;

                while(set.contains(num+length))
                {
                    length++;
                }
            }
            max_length=Math.max(max_length,length);
        }


        

        
        return max_length;
    }
}
