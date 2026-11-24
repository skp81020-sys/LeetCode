class Solution {
    int dir[][]={
        {-1,0},{1,0},{0,-1},{0,1}
    };
    class Pair{
        int i;
        int j;
        int des;
        Pair(int i,int j,int des){
            this.i=i;
            this.j=j;
            this.des=des;
        }
    }
    public int minimumEffortPath(int[][]  nums) {
        int n=nums.length;
        int m=nums[0].length;
        int ans[][]=new int[n][m];
        boolean vis[][]=new boolean[n][m];
        for(int i=0;i<n;i++){
            Arrays.fill(ans[i],Integer.MAX_VALUE);
        }
        ans[0][0]=0;
        PriorityQueue<Pair> q=new PriorityQueue<>((a,b)->Integer.compare(a.des,b.des));
        int res=Integer.MAX_VALUE;
        q.add(new Pair(0,0,0));
        while(!q.isEmpty()){
            Pair p=q.poll();
            int i=p.i;
            int j=p.j;
            int des=p.des;
            //  if(i==n-1 && j==m-1){
            //     res=Math.min(res,ans[i][j])
            //  }
            if(vis[i][j]==true) continue;
            vis[i][j]=true;
            for(int k=0;k<4;k++){
                int ni=i + dir[k][0];
                int nj=j + dir[k][1];
                if(ni >= 0 && nj >= 0  && ni < n && nj < m ){
                    int diff=Math.abs(nums[i][j]-nums[ni][nj]);
                    int newDis=Math.max(diff,des);
                     if (newDis < ans[ni][nj]) {
                        ans[ni][nj] = newDis;
                        q.add(new Pair(ni, nj, newDis)); // Fixed: push newDis, not diff
                    }
                } 
            }
        }
        return ans[n-1][m-1];
    }
}