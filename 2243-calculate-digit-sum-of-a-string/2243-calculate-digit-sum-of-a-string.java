class Solution {
    String digit(String s , int k){
         String ans ="";
         int n=s.length();
        for(int i=0;i<n;i=i+k){
            int a=0;
            for(int j=i; j <n && j < i+k ;j++){
                a +=s.charAt(j) - '0';;
            }
            ans +=a;
        }
        return ans;
    }
    public String digitSum(String s, int k) {
        String ans="";
        if(s.length() <= k) return s;
        ans=digit(s,k);
        while(ans.length() > k){
            s=ans;
            ans="";
            ans=digit(s,k);
        }
        return ans;
        }
}