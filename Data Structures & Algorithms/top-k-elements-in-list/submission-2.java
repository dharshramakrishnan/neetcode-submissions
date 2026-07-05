class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> mpp =new HashMap<Integer,Integer>();

        for(int i=0;i<nums.length;i++)
        {
            mpp.put(nums[i],mpp.getOrDefault(nums[i],0)+1);
        }

        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->Integer.compare(b[1],a[1]));

        for(Map.Entry<Integer,Integer> x: mpp.entrySet())
        {
            pq.offer(new int[]{
                x.getKey(),x.getValue()
            });
        }
        int[] ans=new int[k];
        int i=0;
        while(k>0)
        {
            ans[i]=pq.poll()[0];
            i++;
            k--;
        }

        return ans;
    }
}
