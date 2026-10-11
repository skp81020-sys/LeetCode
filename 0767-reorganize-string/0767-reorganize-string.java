class Solution {
    public class pair {
        int freq;
        char ch;

        pair(int f, char c) {
            freq = f;
            ch = c;
        }
    }

    public String reorganizeString(String s) {
        int n = s.length();
        int[] f = new int[26];

        for (int i = 0; i < n; i++) {
            f[s.charAt(i) - 'a']++;
        }

        PriorityQueue<pair> pq = new PriorityQueue<>((a, b) -> b.freq - a.freq);

        for (int i = 0; i < 26; i++) {
            if (f[i] > 0) {
                pq.add(new pair(f[i], (char) ('a' + i)));
            }
        }

        StringBuilder ans = new StringBuilder();

        while (!pq.isEmpty()) {
            pair p = pq.poll();

            if (ans.length() > 0 && ans.charAt(ans.length() - 1) == p.ch) {
                // top char clashes, so use the next best one
                if (pq.isEmpty()) return "";
                pair q = pq.poll();
                ans.append(q.ch);
                q.freq--;
                if (q.freq > 0) pq.add(q);
                pq.add(p); // p unused, put it back
            } else {
                ans.append(p.ch);
                p.freq--;
                if (p.freq > 0) pq.add(p);
            }
        }

        return ans.toString();
    }
}