class Solution {
   public static  int dfs(int arr[][],int n, int m,int i,int j,int dp[][]){
        if(dp[i][j] > 0) return dp[i][j];
        // Base case 
        if(i==n || j==m ){
            return 1;
        }
        int up=0;int dowm=0;int right=0;int left =0;
        // to calcutae the FOur directios 
        // up
        if(i > 0 && arr[i-1][j] > arr[i][j]){
              up=dfs(arr, n, m, i-1, j,dp)+1;
        }
        //  dowm 
        if(i < n-1 && arr[i+1][j] > arr[i][j]){
             dowm=dfs(arr, n, m, i+1, j,dp)+1;
        }

        // left 
        if(j > 0 && arr[i][j-1] > arr[i][j]){
             left=dfs(arr, n, m, i, j-1,dp)+1;
        }
        //  right
        if(j < m-1 && arr[i][j+1] > arr[i][j]){
              right=dfs(arr, n, m, i, j+1,dp)+1;
        }

       int  ans1 =Math.max(right, left);
       int ans2=Math.max(up,  dowm);
       return dp[i][j]=Math.max(ans1, ans2);
       
    }
    public int longestIncreasingPath(int[][]  arr) {
        int n=arr.length;
        int m=arr[0].length;
        int ans =0;
        int dp[][]=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                ans =Math.max(ans, dfs(arr,n,m,i,j,dp)+1);
            }
        }
        return ans ;
    }
}