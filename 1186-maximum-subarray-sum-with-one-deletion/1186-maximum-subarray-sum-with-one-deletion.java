class Solution {
    public int maximumSum(int[] arr) {
        int del=0;
        int nodel=arr[0];
        int ans =arr[0];

        for(int i=1;i<arr.length;i++){
            int predel=del;
            int prenodel=nodel;

            nodel=Math.max((prenodel + arr[i]) , arr[i]);
            del=Math.max(predel+arr[i],prenodel);

            ans =Math.max(ans,Math.max(nodel,del));
        }

        return ans;
    }
}