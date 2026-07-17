class Solution {
    public static int longestPalinDrome(String s,int i,int j,int dp[][]){
        // Base case 
        if(i > j ){
            return 0;
        }
        if(dp[i][j]!=-1) return dp[i][j];
        if(i==j) return 1;
        if(s.charAt(i)==s.charAt(j)){
            return dp[i][j]= longestPalinDrome(s, i+1, j-1,dp)+2;
        }else{
            int ans1=longestPalinDrome(s, i+1, j,dp);
            int ans2=longestPalinDrome(s, i, j-1,dp);
            int ans3=longestPalinDrome(s, i+1, j-1,dp);

            return dp[i][j]=Math.max(ans1,Math.max(ans2, ans3));
        }
    }
    public int longestPalindromeSubseq(String s) {
        int n=s.length();
        int dp[][]=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                dp[i][j]=-1;
            }
        }
        return longestPalinDrome(s, 0,s.length()-1,dp);
    }
}