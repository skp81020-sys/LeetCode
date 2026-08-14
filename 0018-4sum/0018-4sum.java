class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> ans=new ArrayList<>();
        int n=nums.length;
        for(int i=0;i<n-3;i++){
            if (i > 0 && nums[i] == nums[i - 1]) continue;
                for(int k=i+1;k<n-2;k++){
                    if (k > i+1 && nums[k] == nums[k - 1]) continue;
                    int x=k+1;
                    int y=n-1;
                    while(x<y){
                        long sum = (long) nums[i] + nums[k] + nums[x] + nums[y];
                        if(sum==target){
                          List<Integer> a = new ArrayList<>(Arrays.asList(nums[i], nums[k], nums[x], nums[y]));
                            // Collections.sort(a);
                                ans.add(a);
                                 x++;
                            y--;

                            while (x < y && nums[x] == nums[x - 1]) x++;
                            while (x < y && nums[y] == nums[y + 1]) y--; 
                      }else if(sum < target ){
                            x++;
                        }else{
                            y--;
                        }
                        }
                    }
            }
        return ans;
    }
}