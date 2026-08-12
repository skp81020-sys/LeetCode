class Solution {
    public int[] sortedSquares(int[] nums) {
        int j=nums.length;

        // find out Positive integer
        for(int i=0;i<nums.length;i++){
            if(nums[i] >= 0){
                j=i;
                break;
            }
        }
        int n=nums.length;
        int res[]=new int[n];
        int a=0;
        int i=j-1;
        while(  i >=0 && j <nums.length){
            if(nums[i] * nums[i] < nums[j] * nums[j]){
                res[a]=nums[i] * nums[i];
                i--;
            }else{
                 res[a]=nums[j] * nums[j];
                 j++;
            }
            a++;
        }
        // reaming i the element 
        while(i>=0){
            res[a++]=nums[i] * nums[i];
                i--;
        }
        // reaming j element 
        while(j<n){
            res[a++]=nums[j] * nums[j];
                 j++;
        }

        return res;
    }
}