class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans =new ArrayList<>();
        int n=nums.length;
        HashSet<ArrayList<Integer>> s=new HashSet<>();
        
        for(int i=0;i<n;i++){
            HashSet<Integer> hs = new HashSet<>(); 
            for(int j=i+1;j<n;j++){
                    int numk=-(nums[i]+nums[j]);
                    if(hs.contains(numk)){
                        hs.remove(numk);
                        ArrayList<Integer> arr=new ArrayList<>();
                        arr.add(nums[i]);
                        arr.add(nums[j]);
                        arr.add(numk);
                        Collections.sort(arr);
                        if(!s.contains(arr)){
                             ans.add(arr);
                             s.add(arr);
                        }
                    }
                     hs.add(nums[j]);
            }
        }
        return ans;
    }
}