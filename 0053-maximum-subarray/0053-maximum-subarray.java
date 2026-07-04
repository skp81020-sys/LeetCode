class Solution {
    public int maxSubArray(int[] arr) {
        int maxSum=Integer.MIN_VALUE;
    int cursum=0;
    for(int i=0;i<arr.length;i++){
        cursum+=arr[i];
        if(maxSum < cursum){
            maxSum=cursum;
        }
        if(cursum < 0){
            cursum=0;
        }
    }
    System.out.println(maxSum);
    return maxSum;
    }
}