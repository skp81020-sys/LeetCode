class Solution {
    public int minEatingSpeed(int[]  nums, int h) {
        int n=nums.length;
        int low=1;
        int high=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            high=Math.max(nums[i],high);
        }
        int ans=high;
        while(low < high){
            int mid=low+(high-low)/2;
            int g=0;
            for(int i=0;i<n;i++){
                g +=nums[i]/mid;
                if(nums[i]%mid !=0) g++;
            }
            if(g <= h){
                ans=Math.min(ans,mid);
                high=mid;
            }
            else{
                low=mid+1;
            }
        }

        return ans;
    }
}