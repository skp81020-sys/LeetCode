class Solution {
    public int findDuplicate(int[] nums) {
        // if(nums.length > 3) return nums[0];
       int slow=0;
       int fast=0; 

       while(true){
        slow=nums[slow];
        fast=nums[nums[fast]]; 
         if(slow == fast){
            slow=0;
            while(true){
                 slow=nums[slow];
                 fast=nums[fast];
                 if(slow == fast) return  slow;
            }
          }
       }
    }
}