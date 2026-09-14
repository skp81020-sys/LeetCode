class Solution {
    public int longestPalindrome(String s) {
        int arr[]=new int[256];
        for(int i=0;i<s.length();i++){
            arr[s.charAt(i)]++;
        }
        int ans =0;
        boolean flag=true;
         for(int i=0;i<256;i++){
            if(arr[i] %2 !=0){
                ans +=arr[i]-1;
                 if(flag){
                ans +=1;
                flag=false;
            }
            }else{
                ans +=arr[i];
            }
           
         }

         return ans;
    }
}