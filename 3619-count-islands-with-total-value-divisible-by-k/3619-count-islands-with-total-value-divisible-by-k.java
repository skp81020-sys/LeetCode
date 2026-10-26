class Solution {
    int n;
    int m;
    int direction[][]={
        {1,0},{0,1},{-1,0},{0,-1}
    };
    long dfs(int i,int j,int grid[][]){
        long sum =grid[i][j];
        grid[i][j]=0;
        for(int[] dir : direction){
            int i_=i+dir[0];
            int j_=j+dir[1];
            if(i_ >= 0 && i_ < n && j_ >= 0 && j_ < m && grid[i_][j_] > 0){
                sum +=dfs(i_,j_,grid);
            }
        }
        return sum;

    }
    public int countIslands(int[][] grid, int k) {
        n=grid.length;
        m=grid[0].length;
        int ans =0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j] >0){
                    long sum=dfs(i,j,grid);
                    if(sum % k ==0) ans++;
                }
            }
        }

        return ans;
    }
}