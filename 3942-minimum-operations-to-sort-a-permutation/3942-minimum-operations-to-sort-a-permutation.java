class Solution {
    public int minOperations(int[] nums) {
        int k=nums[0];
        boolean incresing=true;
        int idx=-1;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]==0) idx=i;
            if(nums[i]!=k){
                incresing=false;
                break;
            }
            k=(k+1)%n;
        }

        boolean decreaing=true;
        k=nums[0];
        for(int i=0;i<n;i++){
            if(nums[i]==0) idx=i;
            if(nums[i]!=k){
                decreaing=false;
                break;
            }

            k=(k-1+n)%n;
        }

        if(incresing==true){
            return Math.min(idx,n-idx+2);
        }

        if(decreaing==true){
            return Math.min(idx+2,n-idx);
        }

        return -1;
    }
}