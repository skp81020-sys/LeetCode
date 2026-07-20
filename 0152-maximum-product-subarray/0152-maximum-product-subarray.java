class Solution {
    public int maxProduct(int[] nums) {
        int submax =Integer.MIN_VALUE;
        int n=nums.length;
        for(int i=0;i<n;i++){
            int ans=1;
            for(int j=i;j<n;j++){
                ans *=nums[j];
                submax=Math.max(submax,ans);
            }
            
        }

        return submax;
    }
}