class Solution {
      static class Pair {
        int node, dis;
        Pair(int node, int dis) {
            this.node = node;
            this.dis = dis;
        }
    }
    public int networkDelayTime(int[][] times, int n, int src) {
         ArrayList<ArrayList<ArrayList<Integer>>> adj = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            adj.add(new ArrayList<>());
        }
        src--;

        // 2. Edges add karne ke liye times.length tak loop chalayein
        for (int i = 0; i < times.length; i++) {
            int s = times[i][0];
            int d = times[i][1];
            int w = times[i][2];
            s--;
            d--;
            // Typo fix: 'adj.get(s).add' aur 'ArrayList'
            adj.get(s).add(new ArrayList<>(List.of(d, w)));
        }
          ArrayList<Integer> ans =new ArrayList<>();
        //  int n=adj.size();
        for(int i=0;i<n;i++){
            if(i==src){
                ans.add(i,0);
            }else ans.add(i,Integer.MAX_VALUE);
        }
        PriorityQueue<Pair>  q =new PriorityQueue<>((a, b) -> Integer.compare(a.dis, b.dis));
        int vis[]=new int[n];
        q.add(new Pair(src,0));
        while(!q.isEmpty()){
            Pair p=q.poll();
            int node=p.node;
            int dis=p.dis;
            vis[node]=1;
            // Call For the all Neighours 
            for(int i=0;i<adj.get(node).size();i++){
                int x=adj.get(node).get(i).get(0);
                int y=adj.get(node).get(i).get(1);
                if(vis[x]==0){
                    int newDis=dis+y;
                   if (newDis < ans.get(x)){
                        ans.set(x, newDis);
                        q.add(new Pair(x,newDis));
                    }
                }
            }
        }
        
        int a=-1;
        for(int i=0;i<n;i++){
            a=Math.max(ans.get(i),a);
        }
        if(a==Integer.MAX_VALUE) return -1;
        return a;
    }
}