class Solution {
    int dir[][]={{-1,0},{1,0},{0,-1},{0,1}};
    void dfs(int i,int j ,char grid[][],int n ,int m){
        grid[i][j]='0';
        for(int k=0;k<4;k++){
            int ni  =i +dir[k][0];
            int nj  =j+dir[k][1];
            if(ni < 0 || nj < 0 || ni >= n || nj >=m ||  grid[ni][nj]=='0')  continue;
            else  dfs(ni,nj,grid,n,m);
        }
    }
    public int numIslands(char[][] grid) {
        int ans =0;
        int n=grid.length;
        int m=grid[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]=='1'){
                    ans++;
                    dfs(i,j,grid,n,m);
                }
            }
        }

        return ans;
    }
}