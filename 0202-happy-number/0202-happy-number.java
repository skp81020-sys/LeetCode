class Solution {
    public static int fun(int n){
        int sum =0;
        while(n > 0){
            int r=n%10;
            n=n/10;
            sum +=r*r;
        }

        return sum;
    }
    public boolean isHappy(int n) {
        int slow=n;
        int fast=n;

        while(fast !=1){
            slow=fun(slow);
            fast=fun(fun(fast));
            if(fast==slow && slow !=1){
                return false;
            }
        }
        return true;
    }
}