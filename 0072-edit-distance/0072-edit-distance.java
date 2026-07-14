class Solution {
    public int minDistance(String str1, String str2) {
         int n=str1.length();
        int m=str2.length();

        int dp[][]=new int[n+1][m+1];
        // Base case
        for(int i=0;i<n+1;i++){
            dp[i][0]=i;
        }
        for(int i=0;i<m+1;i++){
            dp[0][i]=i;
        }

        for(int i=1;i<n+1;i++){
            for(int j=1;j<m+1;j++){
                if(str1.charAt(i-1)==str2.charAt(j-1)){
                    dp[i][j]=dp[i-1][j-1];
                }
                else{
                    int add=dp[i][j-1]+1;
                    int del=dp[i-1][j]+1;
                    int iser=dp[i-1][j-1]+1;
                    dp[i][j]=Math.min(add, Math.min(del, iser));
                }
            }
        }
        // for(int i=0;i<n+1;i++){
        //     for(int j=0;j<m+1;j++){
        //         System.out.print(dp[i][j]+" ");
        //     }
        //     System.out.println();
        // }
        return dp[n][m];
    }
}