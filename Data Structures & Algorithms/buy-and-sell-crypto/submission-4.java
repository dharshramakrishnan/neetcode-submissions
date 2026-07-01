class Solution {
    public int maxProfit(int[] prices) {
        
    int max_profit=0;
    int i=0;
    int j=1;
    while(i<j && j<prices.length)
    {

        if(prices[i]<=prices[j])
        {
           max_profit=Math.max(max_profit,prices[j]-prices[i]);
           j++;
        }
        else if(prices[i]>prices[j])
        {
            i=j;
            j++;
        }
        else
        {
            j++;
        }
    }

    return max_profit;

    }
}
