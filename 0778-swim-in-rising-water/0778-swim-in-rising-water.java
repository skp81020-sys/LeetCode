class Solution {
    int n ;
    int m;
    class Pair{
        int i;
        int j;
        Pair(int i,int j){
            this.i=i;
            this.j=j;
        }
    }
    int dir[][]={
        {1,0},{-1,0},{0,1},{0,-1}
    };
    boolean bfs(int cost ,int nums[][]){
        Queue<Pair> q=new LinkedList<>();
         boolean[][] vis = new boolean[n][m];
          vis[0][0]= true;
        q.add(new Pair(0,0));
        while(!q.isEmpty()){
            Pair p=q.poll();
            int i=p.i;
            int j=p.j;
            if(i==n-1 && j== m-1 ) return true;
            for(int k=0;k<4;k++){
                int ni=i+dir[k][0];
                int nj=j+dir[k][1];
                if(ni >= 0 && nj >=0 && ni  < n && nj < m && nums[ni][nj] <= cost && vis[ni][nj]== false){
                     q.add(new Pair(ni,nj));
                     vis[ni][nj]= true;
                }
            }
        }
        return false;
    }
    public int swimInWater(int[][] grid) {
         n=grid.length;
         m =grid[0].length;
        int lo=grid[0][0];
        int hi=grid[0][0];
        for(int i=0;i<m;i++){
            for(int j=0;j<m;j++){
                hi=Math.max(grid[i][j],hi);
            }
        }
        int ans=hi;
        while(lo <= hi ){
            int mid=lo+(hi-lo)/2;
            if(bfs(mid,grid)==true){
                ans =mid;
                hi=mid-1;
            }else lo=mid+1;
        }

        return ans;
    }
}