class Solution {
    public long minimumCost(int cost1, int cost2, int costBoth, int need1, int need2) {
        long ans = 0;
        
       
        int shared = Math.min(need1, need2);
        ans += (long) shared * Math.min(cost1 + cost2, costBoth);
        
       
        need1 -= shared;
        need2 -= shared;
        
        
        if (need1 > 0) {
            ans += (long) need1 * Math.min(cost1, costBoth);
        }
        
         
        if (need2 > 0) {
            ans += (long) need2 * Math.min(cost2, costBoth);
        }
        
        return ans;
    }
}