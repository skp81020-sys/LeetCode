class Solution {
    public int removeDuplicates(int[] nums) {
        int n=nums.length;
       HashMap<Integer, Integer> hs = new HashMap<>();
        int i=-1;
        for(int j=0;j<n;j++){
            hs.put(nums[j],hs.getOrDefault(nums[j], 0) + 1);

            if(hs.get(nums[j])<=2){
                i++;
                nums[i]=nums[j];
            }
        }

        return i+1;
    }
}