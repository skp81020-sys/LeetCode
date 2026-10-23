class Solution {
    void generate(int nums[],int idx,List<List<Integer>> ans,List<Integer> temp ,int n){
        // Base case 
        if(idx==n){
             ans.add(new ArrayList<>(temp));
            return;
        }
        // Choose karo
        temp.add(nums[idx]);
        generate(nums,idx+1,ans,temp,n);
         temp.remove(temp.size() - 1);   
        // chosee nhi karo
         generate(nums,idx+1,ans,temp,n);

       
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
         List<Integer>  temp=new ArrayList<>();
        generate(nums,0,ans,temp,nums.length);
        return ans;
    }
}