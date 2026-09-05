class Solution {
    public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
        int n = firstList.length;
        int m = secondList.length;

        int i = 0, j = 0;
        int ans[][] = new int[n + m][2];
        int a = 0;

        while (i < n && j < m) {
            int sn = firstList[i][0];
            int en = firstList[i][1];
            int sm = secondList[j][0];
            int em = secondList[j][1];

            int lo = Math.max(sn, sm);
            int hi = Math.min(en, em);

            if (lo <= hi) {          // only record real overlaps
                ans[a][0] = lo;
                ans[a][1] = hi;
                a++;
            }

            // advance whichever interval finishes first
            if (en < em) i++;
            else j++;
        }

        return Arrays.copyOf(ans, a);
    }
}