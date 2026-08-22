class Solution {
     public static int fun(int n){
        int sum =0;
        while(n > 0){
            int r=n%10;
            n=n/10;
            sum +=r;
        }

        return sum;
    }
    public int addDigits(int num) {
        if(num < 10) return num;

        while(true){
            if(num < 10 ) return num;
            num=fun(num);
        }
    }
}