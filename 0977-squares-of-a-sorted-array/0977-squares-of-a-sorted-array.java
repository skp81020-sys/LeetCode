class Solution {
    public int[] sortedSquares(int[] nums) {
        int n=nums.length;
        int res[]=new int[n];
        int j=n;

        for(int i=0;i<n;i++){
            if(nums[i] >= 0){
                j=i;
                break;
            }
        }

        int i=j-1;
        int a=0;
        while(i >=0 && j < n){
            if(nums[i]* nums[i] < nums[j] *nums[j]){
                res[a++]=nums[i]*nums[i];
                i--;
            }else{
                 res[a++]=nums[j]*nums[j];
                 j++;
            }
        }

        while( i >=0){
            res[a++]=nums[i]*nums[i];
                i--;
        }

        while( j <n){
            res[a++]=nums[j]*nums[j];
                 j++;
        }

        return res;

    }
}