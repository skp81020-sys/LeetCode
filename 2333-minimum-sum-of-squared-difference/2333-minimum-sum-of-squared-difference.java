class Solution {
    public long minSumSquareDiff(int[] nums1, int[] nums2, int k1, int k2) {
        int n = nums1.length;
        long k = (long) k1 + k2;
        int MAX = 100001;
        long[] cnt = new long[MAX + 1];
        long sum = 0;

        for (int i = 0; i < n; i++) {
            int d = Math.abs(nums1[i] - nums2[i]);
            cnt[d]++;
            sum += d;
        }

        if (sum <= k) return 0;

        // Bade diff ko neeche laao
        for (int v = MAX; v > 0 && k > 0; v--) {
            if (cnt[v] == 0) continue;

            if (cnt[v] <= k) {
                // Poore level ko v-1 pe le aao
                k -= cnt[v];
                cnt[v - 1] += cnt[v];
                cnt[v] = 0;
            } else {
                // Sirf k elements ko ek level neeche karo
                cnt[v] -= k;
                cnt[v - 1] += k;
                k = 0;
            }
        }

        long ans = 0;
        for (int v = 1; v <= MAX; v++) {
            ans += cnt[v] * (long) v * v;
        }
        return ans;
    }
}