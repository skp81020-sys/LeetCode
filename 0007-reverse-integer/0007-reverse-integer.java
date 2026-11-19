class Solution {
    public int reverse(int x) {
        int ans= 0;
        int original=x;
        if(x < 0 ) x=-1 * x;
        while(x > 0){
            int r=x%10;

            if (ans > Integer.MAX_VALUE / 10 || (ans == Integer.MAX_VALUE / 10 && r > 7)) {
                return 0;
            }
            
            // Check for negative overflow before multiplying by 10
            if (ans < Integer.MIN_VALUE / 10 || (ans == Integer.MIN_VALUE / 10 && r < -8)) {
                return 0;
            }
            
            ans =ans*10 +r;
            x=x/10;
        }
        if(original < 0 ) return -1 *ans;
        return ans;
    }
}