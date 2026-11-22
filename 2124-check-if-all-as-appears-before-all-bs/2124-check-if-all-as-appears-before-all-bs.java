class Solution {
    public boolean checkString(String s) {
        int n=s.length();
        int i=0;
        while( i < n){
            char ch=s.charAt(i);
            if(ch=='b') break;
            i++;
        }
        for(int j=i;j<n;j++){
              char ch=s.charAt(j);
              if(ch=='a') return false;
        }
        return true;
    }
}