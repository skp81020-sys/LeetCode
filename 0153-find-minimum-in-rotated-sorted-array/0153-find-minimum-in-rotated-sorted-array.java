class Solution {
    public int findMin(int[] nums) {
        int n=nums.length;
        int si=0;
        int ei=n-1;
        // Not rotated Sorted the Arrays...
        if(nums[si]<=nums[ei]) return nums[si];
        // Rotated and sorted Arrays..
        while(si < ei){
             int mid =(si+ei)/2;
             if(nums[mid] < nums[ei]){
                ei=mid;
             }
             else{
                si=mid+1;
             }
        }
        return nums[si];
    }
}