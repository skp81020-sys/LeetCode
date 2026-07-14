class Solution {
    public boolean isMatch(String s, String p) {
         int n=s.length();
        int m=p.length();

        boolean dp[][]=new boolean[n+1][m+1];

        // Base case : -
        dp[0][0]=true;
        for(int i=1;i<n+1;i++){
            dp[i][0]=false;
        }
        for(int i=1;i<m+1;i++){
            if(p.charAt(i-1)=='*'){
                dp[0][i]=dp[0][i-1];
            }
            else{
                dp[0][i]=false;
            }
        }

        for(int i=1;i<n+1;i++){
            for(int j=1;j<m+1;j++){
                // Case 1 
                if(s.charAt(i-1)==p.charAt(j-1) || p.charAt(j-1)=='?'){
                    dp[i][j]=dp[i-1][j-1];
                }
                // Case No :02 -
                else if(p.charAt(j-1)=='*'){
                    // ignore 
                    boolean ans1=dp[i][j-1];
                    // no ignore 
                    boolean ans2=dp[i-1][j];
                    dp[i][j]= ans1 || ans2;
                }
                else{
                    dp[i][j]=false;
                }
            }
        }
        // for(int i=0;i<n+1;i++){
        //     for(int j=0;j<m+1;j++){
        //         System.out.print(dp[i][j] +" ");
        //     }
        //     System.out.println();
        // }
        return dp[n][m];
    }
}