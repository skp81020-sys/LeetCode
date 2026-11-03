class Solution {
    public int minMoves(int[] nums) {
        int n=nums.length;
        int m=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            m=Math.max(nums[i],m);
        }
        int ans=0;
        for(int i=0;i<n;i++){
            ans +=m-nums[i];
        }

        return ans;
    }
}