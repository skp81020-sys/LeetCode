class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n=nums.length;
        int ans[]=new int[n];
        for(int i=0;i<n;i++){
            int j=i+1;
            int gt=-1;
            while((j % n ) != i ){
                if(nums[j%n] > nums[i]){
                    gt=nums[j%n];
                    break;
                }
                j++;
            }
            ans[i]=gt;
        }
        return ans;
    }
}