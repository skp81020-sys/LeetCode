class Solution {
    public static int buySellTrans(int arr[],int k){
        int n=arr.length;
        int dp[][]=new int[2][n];
        // Base Case 
        dp[0][0]=-1 * arr[0]; // Buying the 1st
        dp[1][0] =0;    // 0th profit

        for(int i=1;i<n;i++){

            // buy the sell 
            dp[0][i]=Math.max(dp[0][i-1], dp[1][i-1]-arr[i]);

            // Selling the Stoct and to pay fee
            dp[1][i]=Math.max(dp[1][i-1], dp[0][i-1] + arr[i]-k);
        }
        // for(int i=0;i<2;i++){
        //     for(int j=0;j<n;j++){
        //          System.out.print(dp[i][j]+" ");
        //     }
        //    System.out.println();
        // }
        return dp[1][n-1];
    }
    public int maxProfit(int[] prices, int fee) {
      return  buySellTrans(prices, fee);
    }
}