class Solution {
    public int minChanges(String s) {
        int ans=0;
        int n=s.length();
        for(int i=0;i<n;i=i+2){
            int a=s.charAt(i);
            int b=s.charAt(i+1);
            if(a !=b ) ans++;
        }
        return ans;
    }
}