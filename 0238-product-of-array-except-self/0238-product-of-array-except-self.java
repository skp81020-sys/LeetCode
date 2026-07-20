class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int ans[]=new int[n];
        Arrays.fill(ans,1);
        int prefix=1;
        for(int i=1;i<n;i++){
            ans[i]=prefix * nums[i-1];
            prefix *=nums[i-1];
        }
        int sufix=1;
        for(int i=n-2;i>=0;i--){
            ans[i] *=sufix * nums[i+1];
            sufix *=nums[i+1];
        }

        return ans;
    }
}