class Solution {
    public int searchInsert(int[] nums, int target) {
        int n=nums.length;
        int lo=0;
        int hi=n-1;
        while(lo <=hi ){
            int mid= (lo +hi)/2;
            if(nums[mid]==target) return mid;
            else if(nums[mid] < target)  lo=mid+1;
            else hi=mid-1;
        }
        if(hi < 0) return 0;
        return hi+1;
    }
}