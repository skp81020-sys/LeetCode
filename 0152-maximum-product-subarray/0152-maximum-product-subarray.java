class Solution {
    public int maxProduct(int[] arr) {
          int ans=Integer.MIN_VALUE;
        int n=arr.length;
        int prefix=1;
        int fllag=0;
        // find out the prefix 
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                fllag=1;
                prefix=1;
            }else{
                prefix *=arr[i];
                ans =Math.max(ans, prefix);
            }
          
        }
        int sufix=1;
        //find out the sufix of the Arrays
        for(int i=n-1;i>=0;i--){
            if(arr[i]==0){
                sufix=1;
            }
            else{
                sufix *=arr[i];
                ans =Math.max(ans, sufix);
            }
             
        }
        if(fllag ==1 && ans < 0){
            return 0;
        }
        return ans;
    }
}