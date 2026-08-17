class Solution {
    public int longestOnes(int[] nums, int k) {
        int low=0;
        int high=0;
        int one=0;
        int zero=0;
        int window=0;
        int n=nums.length;
        for(high=0;high<n;high++){
            if(nums[high]==0) zero++;
            else one++;
            
            int len=high-low +1;
            if((len - one) > k){
                if(nums[low]==0) zero--;
                else one--;
                low++;
            }

            len =high-low+1;
            window=Math.max(window,len);
        }
        return window;
    }
}