class Solution {
    public int sumOfSquares(int[] nums) {
        int n=0;
        int l=nums.length;
        for(int i=1;i<=nums.length;i++){
            // int a=nums[i];
            // int
            if(l % i==0){
                n +=nums[i-1]*nums[i-1];
            }
        }
        return n;
    }
}