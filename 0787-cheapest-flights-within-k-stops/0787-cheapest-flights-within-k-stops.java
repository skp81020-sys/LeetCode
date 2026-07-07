class Solution {
     public static class info{
        int v;
        int  cost;
        int stop;
        info(int v,int cost,int stop){
            this.v=v;
            this.cost=cost;
            this.stop=stop;
        }
    }
    public int findCheapestPrice(int n, int[][] graph, int src, int des, int k) {
          Queue<info> q=new LinkedList<>();
        q.add(new info(src,0, 0));
        int dis[]=new int[n];
        for(int i=0;i<n;i++){
            if(i!=src){
                 dis[i]=Integer.MAX_VALUE;
            }
        }
            while (!q.isEmpty()) {
                info curr=q.remove();
                if(curr.stop > k) break;
                for(int j=0;j<graph.length;j++){
                    if(graph[j][0] != curr.v) continue;
                    // int u=graph[j][0];
                    int v=graph[j][1];
                    int w=graph[j][2];

                   if(curr.cost + w < dis[v] && curr.stop <= k){
                        dis[v]= curr.cost+w;
                        q.add(new info(v, dis[v], curr.stop+1));
                    }
                }
            }
            if(dis[des]==Integer.MAX_VALUE){
                return -1;
            }
            else{
                 return dis[des];
            }
    }
}