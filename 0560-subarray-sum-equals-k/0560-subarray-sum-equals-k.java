class Solution {
    public int subarraySum(int[] nums, int k) {
        int sum =0;
        HashMap<Integer,Integer> hs=new HashMap<>();
        hs.put(0, 1);
        int res=0;
        for(int i=0;i<nums.length;i++){
            sum +=nums[i];
            int ques=sum -k;
            int freq = hs.getOrDefault(ques, 0);
            res +=freq;
            hs.put(sum ,hs.getOrDefault(sum, 0)+1);
        }

        return  res;
    }
}