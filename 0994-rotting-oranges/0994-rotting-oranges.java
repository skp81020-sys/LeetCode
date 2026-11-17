class Solution {
    int dis[][]={{-1,0},{1,0},{0,-1},{0,1}};
    class Pair{
        int i;
        int j;
        int time;
        Pair(int i,int j ,int time){
            this.i=i;
            this.j=j;
            this.time=time;
        }
    }
    public int orangesRotting(int[][]  nums) {

        int n=nums.length;
        int m=nums[0].length;
        Queue<Pair> q=new LinkedList<>();
        // to add the initail all roatated Oranges 
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(nums[i][j]==2){
                    q.add(new Pair(i,j,0));
                }
            }
        }

        int ans =0;
        boolean vis[][]=new  boolean[n][m];
        // Bfs Travrsal 
        while(!q.isEmpty()){
            Pair p=q.poll();
            int i=p.i;
            int j=p.j;
            int time=p.time;
            ans =Math.max(ans,time);
            for(int k=0;k<4;k++){
                int ni=i+dis[k][0];
                int nj= j+dis[k][1];

                if(ni >= 0 && nj >=0 && ni < n && nj < m && vis[ni][nj]==false && nums[ni][nj]==1){
                    vis[ni][nj]=true;
                    nums[ni][nj]=2;
                    q.add(new Pair(ni,nj ,time+1));
                }

            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(nums[i][j]==1){
                    return -1;
                }
            }
        }
        return ans;
           
        
    }
}