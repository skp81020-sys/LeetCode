class Solution {
     public static boolean sumSubset(int target,int arr[],int i,int sum,int dp[][]){
         // Base Case 
         if(i==arr.length) return false;
         if(sum==target) return true;
         if(dp[i][sum]!=-1){
            if(dp[i][sum]==1){
                return true;
            }
            else{
                return false;
            }
            
         }
         // include 
        boolean ans =sumSubset(target,arr,i+1,sum+arr[i],dp) ||  sumSubset(target,arr,i+1,sum,dp);
         if(ans ==true){
            dp[i][sum]=1;
         }
         else{
            dp[i][sum]=0;
         }
        return ans;

    }
    public boolean canPartition(int[] arr) {
        int sum=0;
        int n=arr.length;
        for(int i=0;i<arr.length;i++){
            sum +=arr[i];
        }
        int dp[][]=new  int[n][sum+1];
        for(int i=0;i<n;i++){
            for(int j=0;j<sum+1;j++){
                dp[i][j]=-1;
            }
        }
        if(sum %2==1) return false;
        return sumSubset(sum/2,arr,0,0,dp);
    }
}