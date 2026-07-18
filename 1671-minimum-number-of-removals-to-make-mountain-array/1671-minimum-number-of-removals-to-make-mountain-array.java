class Solution {
     public static void inncreasing(int arr[], int inc[]){
        inc[0]=1;
        for(int i=1;i<arr.length;i++){
            for(int j=i-1;j>=0;j--){
                if(arr[i] > arr[j]){
                     int a=inc[j]+1;
                    if(inc[i] < a){
                        inc[i]=a;
                    }
                }
            }
            if(inc[i]==0) inc[i]=1;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(inc[i]+" ");
        }
    }
    public static void decresing(int arr[],int des[]){
        des[des.length-1]=1;
        int n=arr.length;
        int m=des.length;
        for(int i=n-2;i>=0;i--){
            for(int j=i+1;j<n;j++){
                if(arr[i] > arr[j]){
                    int a=des[j]+1;
                    if(des[i] < a){
                        des[i]=a;
                    }
                }
            }
            if(des[i]==0) des[i]=1;
        }
        for(int i=0;i<des.length;i++){
            System.out.print(des[i]+" ");
        }
    }
    public int minimumMountainRemovals(int[] arr) {
         int inc[]=new int[arr.length];
         inncreasing(arr,inc);
         System.out.println();
         int des[]=new int[arr.length];
         decresing(arr, des);
        int ans =Integer.MAX_VALUE;
        int n=arr.length;
        System.out.println();
         for(int i=1;i<n;i++){
            if(inc[i] > 1 && des[i] > 1){
            ans=Math.min(ans, n-(inc[i]+des[i]-1));
            }
         }

         return ans;
    }
}