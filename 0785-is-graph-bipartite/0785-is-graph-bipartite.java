class Solution {
    boolean ans=true;
    void dfs(int[][]  nums,int node , int col[],boolean vis[],int c){
        vis[node]=true;
        col[node]=c;

        for(int i=0;i<nums[node].length;i++){
            int color;
            if(c == 1)  color=0;
            else color=1;
            int neibhour=nums[node][i];
            if(vis[neibhour]==false){
                dfs(nums,neibhour,col,vis,color);
            }else if(col[neibhour]==c){
                ans =false;
                return;
            }
        }
    }
    public boolean isBipartite(int[][]  nums) {
        int n=nums.length;
        boolean vis[]=new boolean[n];
        int col[]=new int[n];
        for(int i=0;i<n;i++){
            col[i]=-1;
        }

        for(int i=0;i<n;i++){
            if(vis[i]==false)   dfs(nums,i,col,vis,0);
        }
        return ans;
    }
}