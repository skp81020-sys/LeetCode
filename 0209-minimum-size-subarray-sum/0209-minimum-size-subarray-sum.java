class Solution {
    public int minSubArrayLen(int target, int[] nums) {
         int low=0;
         int hight=0;
         int n=nums.length;
         int sum=0;
         int ans =Integer.MAX_VALUE;
         while(hight < n ){
            sum +=nums[hight];
            while(sum >= target ){
                int len=hight - low +1;
                ans =Math.min(ans,len);
                sum -=nums[low];
                low++;
            }
            hight++;
         }
         
        if(ans ==Integer.MAX_VALUE) return 0;
        return  ans;
    }
}