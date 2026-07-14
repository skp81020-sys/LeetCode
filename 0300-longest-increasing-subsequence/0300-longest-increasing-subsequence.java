class Solution {
    public static  int Lis(int arr[]){
        HashSet<Integer> hs=new HashSet<>();

        for (Integer integer : arr) {
            hs.add(integer);
        }
        int arr2[]=new int[hs.size()];
        int k=0;
         for (int num : hs) {
            arr2[k++]=num;
         }
         Arrays.sort(arr2);
        int n=arr.length;
        int m=arr2.length;
        int dp[][]=new int[n+1][m+1];
        // Base of the Arrays 
        for(int i=0;i<n+1;i++){
            dp[i][0]=0;
        }
        for(int i=0;i<m+1;i++){
            dp[0][i]=0;
        }

        int ans=0;
        for(int i=1;i<n+1;i++){
            for(int j=1;j<m+1;j++){
                if(arr[i-1] == arr2[j-1] ){
                    dp[i][j]=dp[i-1][j-1]+1;
                   
                }
                else{
                    dp[i][j]=Math.max(dp[i-1][j], dp[i][j-1]);
                }
            }
        }
        return  dp[n][m];
    }
    public int lengthOfLIS(int[] nums) {
        return Lis(nums);
    }
}