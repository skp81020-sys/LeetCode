class Solution {
    public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
        int n = profits.length;
        int[][] choice = new int[n][2];
        for (int i = 0; i < n; i++) {
            choice[i][0] = capital[i];
            choice[i][1] = profits[i];
        }

        Arrays.sort(choice, (a, b) -> Integer.compare(a[0], b[0]));
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        int idx = 0;
        for (int i = 0; i < k; i++) {
            while (idx < n && choice[idx][0] <= w) {
                pq.add(choice[idx][1]);
                idx++;
            }

            if (pq.isEmpty()) break;

            w += pq.poll();
        }

        return w;
    }
}