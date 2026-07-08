class Solution {
    public static int Area(int grid[][],int i,int j,boolean vis[][]){
        if(grid[i][j]==0) return 0;
        vis[i][j] = true;  
        int up=0;
        int dw=0;
        int left=0;
        int right=0;
        //  up
        if(i-1 >=0 && !vis[i-1][j] && grid[i-1][j]==1){
            vis[i-1][j]=true;
              up=Area(grid, i-1, j, vis);
        }
        // down 
         if(i+1 <grid.length && !vis[i+1][j] && grid[i+1][j]==1){
            vis[i+1][j]=true;
             dw=Area(grid, i+1, j, vis);
        }

        // left
        if(j-1 >=0 && !vis[i][j-1] && grid[i][j-1]==1){
                vis[i][j-1]=true;
                 left=Area(grid, i, j-1, vis);
            }

            // Right
            if(j+1 <grid[0].length && !vis[i][j+1] && grid[i][j+1]==1){
                vis[i][j+1]=true;
                right =Area(grid, i, j+1, vis);
            }
       
        return up+dw+left+right+1;
    }
    public int maxAreaOfIsland(int[][] grid) {
         int n=grid.length;
        int m=grid[0].length;
        boolean vis[][]=new boolean[n][m];
        int ans=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1){
                    ans=Math.max(ans, Area(grid,i,j,vis));
                }
            }
        }
        return ans;
    }
}