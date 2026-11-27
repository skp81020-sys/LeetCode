class Solution {
    public int findMin(int[] nums) {
        int lo=0;
        int n=nums.length;
        int hi=n-1;
        if(nums[lo] < nums[hi]) return nums[0];
        while(lo < hi ){
            int mid=lo+(hi-lo)/2;
            if(nums[mid] < nums[hi]){
                hi=mid;
            }else lo=mid+1;
        }
        return nums[lo];
    }
}