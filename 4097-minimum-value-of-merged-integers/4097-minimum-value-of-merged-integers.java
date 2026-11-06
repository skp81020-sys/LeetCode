class Solution {
    public int minMergedInteger(int[] nums) {
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i=i+2){
            String s=""+nums[i]+nums[i+1];
            int c= Integer.parseInt(s);
            if(c < ans) ans=c;
        }

        return ans;
    }
}