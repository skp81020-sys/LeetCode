class Solution {
    public int minCost(int[][] g) {
        int n = g.length, m = g[0].length;

        // max value se agla power of 2 nikalo (XOR is range ke bahar nahi jata)
        int mx = 0;
        for (int[] row : g)
            for (int v : row) mx = Math.max(mx, v);
        int MAX = 1;
        while (MAX <= mx) MAX <<= 1;

        boolean[][][] dp = new boolean[n][m][MAX];
        dp[0][0][g[0][0]] = true;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                for (int x = 0; x < MAX; x++) {
                    if (!dp[i][j][x]) continue;
                    if (i + 1 < n) dp[i + 1][j][x ^ g[i + 1][j]] = true;
                    if (j + 1 < m) dp[i][j + 1][x ^ g[i][j + 1]] = true;
                }
            }
        }

        for (int x = 0; x < MAX; x++)
            if (dp[n - 1][m - 1][x]) return x;
        return -1;
    }
}