class Solution {
    public int trap(int[]  arr) { 
        int Lm[]=new int[arr.length];
        int Rm[]=new int[arr.length];
        int Final[]=new int[arr.length];

        // To calculate  Left Greatest Element...
        Lm[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            Lm[i]=Math.max(Lm[i-1], arr[i]);
        }
        Rm[arr.length-1]=arr[arr.length-1];
        // To clculate  Right Maximum Elemet 
        for(int i=arr.length-2;i>=0;i--){
             Rm[i]=Math.max(Rm[i+1], arr[i]);
        }
        
        // to clacullte Minimum of thr rm and Lm ..
        for(int i=0;i<arr.length;i++){
            Final[i]=Math.min(Rm[i], Lm[i]);
        }
        // Display(Lm);
        // System.out.println();
        // Display(Rm);
        // System.out.println();
        // Display(Final);
        // CAlculate final result ..
        int Result=0;
        for(int i=0;i<arr.length;i++){
            int Water=Final[i]-arr[i];
            Result +=Water;
        }
        return Result;
    }
}