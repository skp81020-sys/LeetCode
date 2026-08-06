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
    public int countSubstrings(String str) {
        int n=str.length();
        int count =0;
         for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                if(isValid(str, i, j)){
                         count++;
                }
            }
        } 
        return count;
    }
}