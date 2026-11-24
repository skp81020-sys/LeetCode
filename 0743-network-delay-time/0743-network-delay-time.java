class Solution {
    class Pair{
        int node;
        int des;
        Pair(int node ,int des){
            this.node=node;
            this.des=des;
        }
    }
    public int networkDelayTime(int[][] times, int n, int k) {
         List<List<Pair>> adj=new ArrayList<>();
         for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
         }

         for(int i=0;i<times.length;i++){
            int s=times[i][0]-1 ;
            int d=times[i][1]-1 ;
            int t=times[i][2]  ;
            adj.get(s).add(new Pair(d,t));
         }
            k--;
        //Disjstra Algrotim 
        PriorityQueue<Pair> q=new PriorityQueue<>((a,b) -> Integer.compare(a.des,b.des));
        int vis[]=new int[n];
        int ans[]=new int[n];
        Arrays.fill(ans,Integer.MAX_VALUE);
        ans[k]=0;
        q.add(new Pair(k,0));
        while(!q.isEmpty()){
            Pair p=q.poll();
            int node =p.node;
            int des=p.des;
            if(vis[node]==1) continue;
            vis[node]=1;
            // vis[node]= ;
            for(int i=0;i<adj.get(node).size();i++){
                Pair w=adj.get(node).get(i);
                int x=w.node;
                int y=w.des;
                int newdes=des +y ;
                if(ans[x] > newdes ){
                    ans[x]=newdes;
                    q.add(new Pair(x,newdes));
                }
            }
        }

        int a=0;
        for(int i=0;i<n;i++){
            if(ans[i]==Integer.MAX_VALUE) return -1;
            a=Math.max(a,ans[i]);
        }
        return a;
    }
}