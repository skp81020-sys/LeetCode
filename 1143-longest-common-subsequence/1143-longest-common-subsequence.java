class Solution {
    public static int Lcs(String str1,String str2,int n,int m ,int dp[][]){
        if(n==0 || m==0){
            return 0;
        }

        char ch1=str1.charAt(n-1);
        char ch2=str2.charAt(m-1);
        if(ch1==ch2){
            if(dp[n][m]==-1){
                dp[n][m]=Lcs(str1, str2, n-1, m-1, dp)+1;
            }
            return dp[n][m];
        }
        else{
            if(dp[n][m]==-1){
                 return dp[n][m]=Math.max(Lcs(str1, str2, n-1, m, dp), Lcs(str1, str2, n, m-1, dp));
            }
            return dp[n][m];
        }
         
    }
    public int longestCommonSubsequence(String str1, String str2) {
        int dp[][]=new int[str1.length()+1][str2.length()+1];
        for(int i=0;i<str1.length()+1;i++){
            for(int j=0;j<str2.length()+1;j++){
                dp[i][j]=-1;
            }
        }
        return Lcs(str1, str2, str1.length(), str2.length(),dp);
    }
}