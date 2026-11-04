class Solution {
public:
    int searchInsert(vector<int>& nums, int target) {
        int n=nums.size();
       int lo=0;
       int hi=n-1;
       while(lo<=hi){
        int mid= lo+(hi-lo)/2;
        if(nums[mid]==target) return mid;
        else if(nums[mid]>target) hi=mid-1;
        else lo=mid+1;
       } 
       if(hi<0) return 0;
      
      else return hi+1;
    }
};