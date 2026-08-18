class Solution {
    public int longestSubarray(int[] nums) {
        int low=0;
        int high=0;
        int  one=0;
        int window=0;
        for(high=0;high<nums.length;high++){
            if(nums[high]==1) one++;
            int len=high-low+1;

            if((len-one) > 1){
                if(nums[low]==1) one--;
                low++;
            } 
            len=high-low+1;
            window=Math.max(window,len);
        }

        return window-1;
    }
}