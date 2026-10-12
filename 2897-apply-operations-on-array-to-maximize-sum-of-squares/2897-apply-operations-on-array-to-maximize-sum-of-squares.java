class Solution {
    public int maxSum(List<Integer> nums, int k) {
        long mod=1000000007;
        int count[]=new int[32];

        for(int num : nums){
            for(int i=0;i<32;i++){
                if((num&(1<<i))!=0){
                    count[i]++;
                }
            }
        }

        long ans=0;
        for(int i=0;i<k;i++){
            int num=0;

            for(int bit=0;bit<32;bit++){
                if(count[bit]> 0){
                num |=(1L << bit);
                count[bit]--;
              } 
            }

             ans = (ans + (num % mod) * (num % mod)) % mod;
        }

        return (int) ans;
    }
}