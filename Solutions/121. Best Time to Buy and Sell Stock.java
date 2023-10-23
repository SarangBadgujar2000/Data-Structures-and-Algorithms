class Solution {
    public int maxProfit(int[] prices) {
        int low=0;
        int high=1;
        int ans=0;
        while(high<prices.length){
            if(prices[low]<prices[high]){
                int max=prices[high]-prices[low];
                ans=Math.max(ans,max);
            }else{
                low=high;
            }
            high++;
        }
        return ans;
    }
}