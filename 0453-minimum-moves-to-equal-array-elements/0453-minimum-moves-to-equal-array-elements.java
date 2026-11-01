class Solution {
    public int minMoves(int[] nums) {
        int ans=0;
        int m=Integer.MAX_VALUE;
        int idx=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            m=Math.min(m,nums[i]);
        }

        for(int i=0;i<n;i++){
             ans +=nums[i]-m;
        }

        return ans;
    }
}