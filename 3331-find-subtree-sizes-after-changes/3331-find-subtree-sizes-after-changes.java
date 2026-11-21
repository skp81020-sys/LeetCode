class Solution {
         private void reassignParents(int u, String s, List<Integer>[] adj, int[] lastChar, int[] newParent) {
        int c = s.charAt(u) - 'a';
        int prev = lastChar[c];
        if (u != 0 && prev != -1) {
            newParent[u] = prev;
        }
        lastChar[c] = u;

        for (int v : adj[u]) {
            reassignParents(v, s, adj, lastChar, newParent);
        }

        lastChar[c] = prev;
    }

    private int computeSubtreeSizes(int u, List<Integer>[] newAdj, int[] ans) {
        int size = 1;
        for (int v : newAdj[u]) {
            size += computeSubtreeSizes(v, newAdj, ans);
        }
        ans[u] = size;
        return size;
    }
    public int[] findSubtreeSizes(int[] parent, String s) {
          int n = parent.length;
        List<Integer>[] adj = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            adj[i] = new ArrayList<>();
        }
        for (int i = 1; i < n; i++) {
            adj[parent[i]].add(i);
        }

        int[] newParent = Arrays.copyOf(parent, n);
        int[] lastChar = new int[26];
        Arrays.fill(lastChar, -1);

        reassignParents(0, s, adj, lastChar, newParent);

        List<Integer>[] newAdj = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            newAdj[i] = new ArrayList<>();
        }
        for (int i = 1; i < n; i++) {
            newAdj[newParent[i]].add(i);
        }

        int[] ans = new int[n];
        computeSubtreeSizes(0, newAdj, ans);
        return ans;
    }
}