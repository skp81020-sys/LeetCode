class Solution {
    public int pivotIndex(int[] nums) {
        int sum=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            sum +=nums[i];
        }

        int left=0;
        for(int i=0;i<n;i++){
            if(left == sum -left-nums[i]) return i;
               left +=nums[i];
        }

        return -1;
    }
}