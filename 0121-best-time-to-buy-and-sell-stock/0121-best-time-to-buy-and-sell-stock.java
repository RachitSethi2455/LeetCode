class Solution {
    public int maxProfit(int[] prices) {
        /*int max=0;
        for(int i =0; i <prices.length;i++){
            for(int j =i+1;j<prices.length;j++){
                int diff = prices[j] - prices[i];
                max = Math.max(max,diff);
            }
        }
        return max;*/
        int min =prices[0];
        int pro =0;
        for(int i =0; i < prices.length ; i++){
            min = Math.min(min,prices[i]);
            int diff = prices[i] - min;
            pro = Math.max(pro,diff);
        }
        return pro;
    }
}