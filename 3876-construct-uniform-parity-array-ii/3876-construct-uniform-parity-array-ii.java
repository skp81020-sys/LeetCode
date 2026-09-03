class Solution {
    public boolean uniformArray(int[] nums) {
        boolean check=true;
        // to check all even 
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i] % 2!=0) {
                check=false;
                break;
            }
        }
        if(check) return true;
        // to chesk the all Odd number 
        int minOdd=Integer.MAX_VALUE;
        check=true;
         for(int i=0;i<n;i++){
            if(nums[i] % 2!=0) {
               minOdd=Math.min(minOdd,nums[i]);
            }else{
                 check=false;
            }
        }
         if(check) return true;

         for(int i=0;i<n;i++){
            if(nums[i]!=minOdd){
                if(nums[i]%2!=0) continue;
                if((nums[i]-minOdd) % 2!=0 && (nums[i]-minOdd) >=1){
                    continue;
                }else{
                    return false;
                }
            }
         }

         return true;
    }
}