class Solution {
    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    private int lcm(int a, int b) {
        return (a / gcd(a, b)) * b;
    }
    public int maxLength(int[] nums) {
         int n = nums.length;
        int maxLen = 1;

        // Calculate the upper bound for product (total LCM * max element)
        int maxLcm = 1;
        int maxVal = 0;
        for (int num : nums) {
            maxLcm = lcm(maxLcm, num);
            maxVal = Math.max(maxVal, num);
        }
        int limit = maxLcm * maxVal;

        for (int i = 0; i < n; i++) {
            int prod = 1;
            int gcdVal = 0;
            int lcmVal = 1;

            for (int j = i; j < n; j++) {
                int x = nums[j];
                prod *= x;

                // Stop early if product exceeds maximum possible lcm * gcd
                if (prod > limit) {
                    break;
                }

                gcdVal = (gcdVal == 0) ? x : gcd(gcdVal, x);
                lcmVal = lcm(lcmVal, x);

                if (prod == lcmVal * gcdVal) {
                    maxLen = Math.max(maxLen, j - i + 1);
                }
            }
        }

        return maxLen;
    }
}