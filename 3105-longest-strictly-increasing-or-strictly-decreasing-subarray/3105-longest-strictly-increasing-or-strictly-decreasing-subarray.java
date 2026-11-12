class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int ans =1;
        int a=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i-1] < nums[i]) {
                a++;
            }else{
                ans =Math.max(a,ans);
                a=1;
            }
        }
         ans =Math.max(a,ans);
        a=1;
       for(int i=1;i<nums.length;i++){
            if(nums[i-1] > nums[i]) {
                a++;
            }else{
                ans =Math.max(a,ans);
                a=1;
            }
        }
         ans =Math.max(a,ans);
        return ans;
    }
}