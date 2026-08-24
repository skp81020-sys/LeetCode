class Solution {
    public int maxProduct(int[] nums) {
        int maxe=nums[0];
        int mine=nums[0];
        int ans=nums[0];
        for(int i=1;i<nums.length;i++){
            int v1=nums[i];
            int v2=nums[i]*maxe;
            int v3=nums[i]*mine;

            maxe=Math.max(v2,Math.max(v3,v1));
            mine=Math.min(v2,Math.min(v1,v3));

            ans =Math.max(ans ,Math.max(maxe,mine));
        }


        return ans;
    }
}