class Solution {
    public int minSumOfLengths(int[] arr, int target) {
        int n = arr.length;
        int[] minLen = new int[n]; // minLen[i] = min window length with sum=target, ending at index <= i
        Arrays.fill(minLen, Integer.MAX_VALUE);

        int low = 0, sum = 0, best = Integer.MAX_VALUE, ans = Integer.MAX_VALUE;

        for (int high = 0; high < n; high++) {
            sum += arr[high];
            while (sum > target) {
                sum -= arr[low++];
            }
            if (sum == target) {
                int len = high - low + 1;
                if (low > 0 && minLen[low - 1] != Integer.MAX_VALUE) {
                    ans = Math.min(ans, minLen[low - 1] + len);
                }
                best = Math.min(best, len);
            }
            minLen[high] = best;
        }
        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}