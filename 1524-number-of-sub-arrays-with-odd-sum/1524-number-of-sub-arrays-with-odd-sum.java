class Solution {
    public int numOfSubarrays(int[] nums) {
         long ans = 0;
        int m = 1000000007;
        
        // Start with evenCount = 1 to account for an empty prefix sum of 0
        int evenCount = 1; 
        int oddCount = 0;
        int prefixSum = 0;

        for (int num : nums) {
            prefixSum += num;

            if (prefixSum % 2 == 0) {
                ans = (ans + oddCount) % m;
                evenCount++;
            } else {
                ans = (ans + evenCount) % m;
                oddCount++;
            }
        }

        return (int) ans;
    }
}