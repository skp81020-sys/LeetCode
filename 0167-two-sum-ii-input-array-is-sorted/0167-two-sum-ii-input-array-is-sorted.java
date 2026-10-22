class Solution {
    public int[] twoSum(int[] numbers, int target) {
       int lo=0;
       int n=numbers.length;
       int hi=n-1;
       int ans[]=new int[2];
       while(lo < hi){
            if(numbers[lo]+numbers[hi]==target){
                ans[0]=lo+1;
                ans[1]=hi+1;
                return ans;
            }
            if(numbers[lo]+numbers[hi] > target) hi--;
            else lo++;
       } 

       return ans;
    }
}