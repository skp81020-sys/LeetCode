class Solution {
    public int findMaxLength(int[] nums) {
        int zero=0;
        int one=0;
        int res =0;
        HashMap<Integer,Integer> hs=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0) zero++;
            else one++;
            int diff=zero-one;
            if(diff==0){
                res=Math.max(res,i+1);
            }else if(!hs.containsKey(diff)){
                hs.put(diff,i);
            }else{
                res=Math.max(res,i-hs.get(diff));
            }
        }
        return res;
    }
}