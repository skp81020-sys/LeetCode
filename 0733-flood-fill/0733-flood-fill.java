class Solution {
    int n;
    int m;
    int dir[][]={
        {1,0},{-1,0},{0,1},{0,-1}
    };

    void dfs(int nums[][],int ans[][] , int i,int j ,boolean vis[][],int color,int startColor){
        vis[i][j]=true;
        ans[i][j]=color;

        for(int k=0;k<4;k++){
             int ni=dir[k][0] + i;
             int nj=dir[k][1]+j;
             if(ni >= 0 && nj >=0 && ni < n && nj < m && vis[ni][nj]==false &&  nums[ni][nj]==startColor){
                dfs(nums,ans,ni,nj,vis,color,startColor);
             } 
        }

    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
          n=image.length;
          m=image[0].length;
           int startColor = image[sr][sc];
           if(startColor == color) return image;
          int ans[][]=new int[n][m];
           for (int i = 0; i < n; i++) {
            ans[i] = image[i].clone();
        }

          boolean vis[][]=new  boolean[n][m];
          dfs(image,ans,sr,sc,vis,color,startColor);
          return ans;
    }
}