class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int product=1;
        int flag=0;
        for(int i=0;i<n;i++){
            if(nums[i]==0){
                flag+=1;
            }
            else{
                 product *=nums[i];
            }
           
        }
        int ans[]=new int[n];
        for(int i=0;i<n;i++){
            if(flag==1 && nums[i]!=0){
                ans[i]=0;
            }
            else if(flag==1 && nums[i]==0){
                ans[i]=product;
            }
            else if(flag >1 ){
                ans[i]=0;
            }
            else{
                ans[i]=product/nums[i];
            }
        }

        return ans;
    }
}