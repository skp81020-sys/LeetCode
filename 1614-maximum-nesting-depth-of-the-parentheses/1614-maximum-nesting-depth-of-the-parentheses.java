class Solution {
    public int maxDepth(String s) {
        int n=s.length();
        int ans =0;
        int a=0;
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(ch=='(') {
                ans++;
                a=Math.max(a,ans);
            }
            else if(ch==')') ans--;
        }
        return a;
    }
}