class Solution {
     public static int houseRobber(int arr[],int i,int dp[]){
        
        if(i >= arr.length) return 0;
        if(dp[i] !=-1) return dp[i];
        // include 
        int ans =0;
        
            int ans1= arr[i]+houseRobber(arr, i+2,dp);
            int ans2=houseRobber(arr, i+1,dp);
            ans=Math.max(ans1, ans2);
       

        return  dp[i]=ans;
    }
    public int rob(int[] nums) {
        int n=nums.length;
        int dp[]=new int[n];
        Arrays.fill(dp, -1);
        return houseRobber(nums,0,dp);
    }
}