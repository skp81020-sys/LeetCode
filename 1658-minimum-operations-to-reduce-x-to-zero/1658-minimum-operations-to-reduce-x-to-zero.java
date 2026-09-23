class Solution {
    public int minOperations(int[] nums, int x) {
        int sum=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            sum +=nums[i];
        }

        int t=sum-x;
        int low=0;
        int high=0;
        sum =0;
        int ans=-1;
        while(high < n ){
            sum +=nums[high];
            while(sum > t && low <n){
                sum -=nums[low];
                low++;
            }
            if(sum==t){
                ans=Math.max(ans,high-low+1);
            }
            high++;
        }

        if(ans==-1) return -1;
        return n-(ans);
    }
}