class Solution {
    public static  int fibo(int n,int fib[]){
        if(n==0 || n==1) return n;
         
        if(fib[n]!=0){
            return fib[n];
        }
        fib[n]=fibo(n-1, fib) +fibo(n-2, fib);

        return fib[n];
         
    }
    public int climbStairs(int n) {
        int f[]=new int[n+2];
        return fibo(n+1,f);
    }
}