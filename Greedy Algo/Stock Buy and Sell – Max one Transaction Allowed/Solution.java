// User function Template for Java

class Solution {
    public int maxProfit(int prices[]) {
       int mini=Integer.MAX_VALUE;
       int maxi=0;
       for(int i=0;i<prices.length;++i){
           mini=Math.min(prices[i],mini);
           if(prices[i]-mini>maxi)
                maxi=prices[i]-mini;
       }
        return maxi;
    }
    public static void main(String args[]) {
        Solution sol = new Solution();
        int prices[] = {7, 1, 5, 3, 6, 4};
        System.out.println("Maximum Profit: " + sol.maxProfit(prices)); // Output: 5
    }
}