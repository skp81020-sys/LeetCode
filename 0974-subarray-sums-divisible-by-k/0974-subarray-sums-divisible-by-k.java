class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int sum =0;
        HashMap<Integer,Integer> hs=new HashMap<>();
        hs.put(0, 1);
        int res=0;
        for(int i=0;i<nums.length;i++){
            sum +=nums[i];
            int rem = sum % k;
            if (rem < 0) rem += k;
            int freq = hs.getOrDefault(rem, 0) ;
            res +=freq;
            hs.put(rem,hs.getOrDefault(rem, 0)+1);
        }

        return  res;
    }
}