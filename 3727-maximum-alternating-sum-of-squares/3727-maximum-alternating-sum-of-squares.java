class Solution {
    public long maxAlternatingSum(int[] nums) {
        // to conver the all number is positive 
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i] < 0) {
                nums[i]=-1 * nums[i];
            }
        }

        Arrays.sort(nums);

        int hi=n-1;
        int lo=0;
        boolean flag=true;
        long ans=0;
        for(int i=0;i<n;i++){
            if(flag==true){
                ans +=nums[hi]*nums[hi];
                flag=false;
                hi--;
            }else{
                ans -=nums[lo]*nums[lo];
                flag=true;
                lo++;
            }
        }

        return ans;
    }
}