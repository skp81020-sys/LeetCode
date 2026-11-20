class Solution {
    public int lengthOfLastWord(String s) {
        int flag=0;
        int n=s.length();
        while(n-1 >=0 ){
            char ch =s.charAt(n-1);
            if(ch != ' ') break;
            n--;
        }
        int ans =0;
        for(int i=n-1;i>=0;i--){
              char ch =s.charAt(i);
            if(ch==' ') return ans;
            ans++;
        }
        return ans;
    }
}