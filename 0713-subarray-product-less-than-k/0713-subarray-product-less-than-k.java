class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int ans=0;
        int count=0;
        int n=nums.length;
        int lo=0;
        int p=1;
        for(int fast=0;fast<n;fast++){
             p *=nums[fast];
             if(k <= 1) return 0;
            while( p >= k ){
                p /=nums[lo];
                lo++;  
            }
            ans +=fast - lo + 1;
        }
        // if(ans==0) return 0;
        return ans;
    }
}