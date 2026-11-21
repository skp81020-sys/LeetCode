class Solution {
    int n;
    int m;
    int vis[][];
    int dir[][]={
        {1,0},{-1,0},{0,1},{0,-1}
    };

    void dfs(int i ,int j,char nums[][]){
        vis[i][j]=1;
       if(nums[i][j]=='X') return;
        for(int k=0;k<4;k++){
            int ni=i+dir[k][0];
            int nj=j+dir[k][1];
           if (ni >= 0 && ni < n && nj >= 0 && nj < m && nums[ni][nj] == 'O' && vis[ni][nj] == 0) {
           dfs(ni, nj, nums);
}
        }
        return;
    }
    public void solve(char[][] board) {
        n=board.length;
        m=board[0].length;
        vis=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(i==0 || j==0 || i == n-1 || j==m-1){
                    if(board[i][j]=='O'){
                        dfs(i,j,board);
                    }
                }
            }
        }


        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                 if(vis[i][j]==1){
                    board[i][j]='O';
                 }else  board[i][j]='X';
            }
        }
        
    }
}