class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);

        int ans=0;
        int closed=Integer.MAX_VALUE;;
        int n=nums.length;
        for(int i=0;i<n-2;i++){
            int j=i+1;
            int k=n-1;

            while(j<k ){
                int sum=nums[i]+nums[j]+nums[k];

                int diff=Math.abs(sum-target);
                if(diff < closed){
                    ans=sum;
                    closed=diff;
                }else if( sum < target ){
                    j++;
                }else{
                    k--;
                }
            }
        }
    return ans;
    }
}