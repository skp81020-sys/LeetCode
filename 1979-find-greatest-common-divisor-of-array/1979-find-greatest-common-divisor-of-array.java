class Solution {
    public int findGCD(int[] nums) {
        int small=nums[0];
        int big=nums[0];
        int n=nums.length;
        for(int i=1;i<n;i++){
            small=Math.min(small,nums[i]);
            big=Math.max(big,nums[i]);
        }
        int ans =1;
        for(int i=1;i<=small;i++){
            if( small % i==0 && big % i==0) ans =i;
        }
         
        return ans;
    }
}