class Solution {
    public boolean canJump(int[] arr) {
          int n=arr.length;

        boolean dp[]=new  boolean[n];
        // Base case 
       
        for(int i=0;i<n-1;i++){
            dp[i]=false;
        }
         dp[n-1]=true;
        for(int i=n-2;i>=0;i--){
            int step=arr[i];
            int ans=Integer.MAX_VALUE;
            for(int j=i+1;j<=i+step && j<n ;j++){
                if(dp[j]){
                    dp[i]=true;
                    break;
                }
            }
             
        }
        return dp[0];
    }
}