class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int i=0;
        int j=0;
        int sum=0;
        int ans =Integer.MAX_VALUE;
        int n=nums.length;
        while(  j < n){
            if(sum < target  && i < n){
                sum +=nums[i];
                i++;
            }else if(sum >= target){
                ans = Math.min(ans, i-j);
                sum -= nums[j];
                j++;
            } else {
                break; // i==n aur sum still < target -> aage kuch nahi milega
            }
        }
        if(ans ==Integer.MAX_VALUE) return 0;
        return  ans;
    }
}