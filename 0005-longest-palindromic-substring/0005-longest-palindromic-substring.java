class Solution {
    public static boolean isValid(String s,int i,int j){
        if(i==j) return true;
        while(i < j){
             if(s.charAt(i) != s.charAt(j)) return false;
            i++;
            j--;
        }
        return  true;
    }
    public String longestPalindrome(String str) {
       int max=0;
        int start=1;
        int end=1;
        int n=str.length();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(isValid(str, i, j)){
                    if(max <(j-i+1)){
                        max=j-i+1;
                        start=i;
                        end=j;
                    }
                }
            }
        } 
        return str.substring(start,end+1); 
    }
}