class Solution {
     public static class Pair{
        int i;
        int j;
        int time;
        Pair(int i,int j,int time){
            this.i=i;
            this.j=j;
            this.time=time;
        }
    }
    public int orangesRotting(int[][] grid) {
          int n=grid.length;
        int m=grid[0].length;

        Queue<Pair> q=new LinkedList<>();
        // to all store the Rotating Orange 
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==2){
                    q.add(new Pair(i, j, 0));
                }
            }
        }
        int ans=0;
        boolean vis[][]=new boolean[n][m];
        while (!q.isEmpty()) {
            Pair curr=q.remove();
            int i=curr.i;
            int j=curr.j;
            int time=curr.time;
            ans=Math.max(ans,time);
            // Call  up 
            if(i-1 >=0 && grid[i-1][j]==1 && !vis[i-1][j]){
                vis[i-1][j]=true;
                grid[i-1][j]=2;
                q.add(new Pair(i-1, j, time+1));
            }
            // call down
             if(i+1 < n && grid[i+1][j]==1 && !vis[i+1][j]){
                vis[i+1][j]=true;
                grid[i+1][j]=2;
                q.add(new Pair(i+1, j, time+1));
            }
            // Call left
             if(j-1 >=0 && grid[i][j-1]==1 && !vis[i][j-1]){
                vis[i][j-1]=true;
                grid[i][j-1]=2;
                q.add(new Pair(i, j-1, time+1));
            }
            // call right 
              // call down
             if(j+1 < m && grid[i][j+1]==1 && !vis[i][j+1]){
                vis[i][j+1]=true;
                grid[i][j+1]=2;
                q.add(new Pair(i, j+1, time+1));
            }
        }
         for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1){
                     return -1;
                }
            }
        }
        return ans; 

    }
}