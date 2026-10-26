class Solution {
    void Csum(int nums[],int n,int idx, List<List<Integer>> ans,List<Integer> arr,int sum ,int target){
        if(idx==n || sum > target) return;
        if(sum==target){
            ans.add(new ArrayList<>(arr));
            return;
        }
        if(sum < target){
            sum +=nums[idx];
            arr.add(nums[idx]);
            Csum(nums,n,idx,ans,arr,sum,target);
            sum -=nums[idx];
            arr.remove(arr.size() - 1);
        }
         Csum(nums,n,idx+1,ans,arr,sum,target);

    }
    public List<List<Integer>> combinationSum(int[]  nums, int target) {
        List<List<Integer>> ans =new ArrayList<>();
        int n=nums.length;
        List<Integer> arr=new ArrayList<>();
        Csum(nums,n,0,ans,arr,0,target);
        return ans;
    }
}