class Solution {
    public boolean isMiddleElementUnique(int[] nums) {
        HashSet<Integer> hs=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(i!=nums.length/2){
                 hs.add(nums[i]);
            }
           
        }

        if(hs.contains(nums[nums.length/2])){
            return false;
        }
        return true;
    }
}