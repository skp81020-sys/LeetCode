class Solution {
    int memo[][]=new int[1001][1501];
    int chepest=Integer.MAX_VALUE;
    int solve(int n,int[][] items, int budget,int copies[]){
        if(n==0 ) {
            return budget/chepest;
        }
        if(memo[n][budget] !=0){
            return memo[n][budget];
        }
        int price=items[n-1][1];
        int take=0;
        int skip=0;
        // take the items
        if(price <= budget){
            take =1+copies[n-1]+solve(n-1,items,budget-price,copies);
        }
        skip=solve(n-1,items,budget,copies);

        return memo[n][budget] = Math.max(take,skip);
    }
    public int maximumSaleItems(int[][] items, int budget) {
        int n=items.length;
        int copies[]=new int[n];
        for(int i=0;i<n;i++){
            int c=0;
            chepest=Integer.min(chepest,items[i][1]);
            for(int j=0;j<n;j++){
                if(i==j) continue;
                if(items[j][0] % items[i][0 ] == 0) c++;
            }
            copies[i]=c;
        }

        return solve(n,items,budget,copies);
    }
}