class Solution {
    int n;
    int m;
     boolean dfs(int grid[][],int r,int c){
            if(r >=n  || r < 0 || c >=m || c < 0) return false;
            // up direction
            if(grid[r][c]==1) return true;

            grid[r][c]=1;

            boolean a=dfs(grid,r-1,c);
            boolean b=dfs(grid,r+1,c);
            boolean e=dfs(grid,r,c-1);
            boolean d=dfs(grid,r,c+1);

            return a && b && e && d;
        }
    public int closedIsland(int[][] grid) {
        n=grid.length;
        m=grid[0].length;
        int ans=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==0){
                    if(dfs(grid,i,j)==true){
                         ans++;
                    }
                }
            }
        }
        return ans;
    }
}