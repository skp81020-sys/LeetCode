class Solution {
    public int[][] insert(int[][] nums, int[] newInterval) {
        int n = nums.length;
        int[][] ans = new int[n + 1][2];

        int a = 0;
        int s = newInterval[0];
        int e = newInterval[1];

        for (int i = 0; i < n; i++) {

            int start = nums[i][0];
            int end = nums[i][1];

            // Current interval completely before newInterval
            if (end < s) {
                ans[a][0] = start;
                ans[a][1] = end;
                a++;
            }

            // Current interval overlaps newInterval
            else if (start <= e) {
                s = Math.min(s, start);
                e = Math.max(e, end);
            }

            // Current interval completely after newInterval
            else {
                ans[a][0] = s;
                ans[a][1] = e;
                a++;

                ans[a][0] = start;
                ans[a][1] = end;
                a++;

                s = Integer.MAX_VALUE;
            }
        }

        // Agar newInterval abhi insert nahi hua
        if (s != Integer.MAX_VALUE) {
            ans[a][0] = s;
            ans[a][1] = e;
            a++;
        }

        return Arrays.copyOf(ans, a);
    }
}