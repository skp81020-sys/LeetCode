class Solution {
    public boolean isPalindromic(String s) {
        String ans ="";

        for(int i=0;i<s.length();i++){
            char ch =s.charAt(i);
            ans +=String.format("%8s", Integer.toBinaryString(ch)).replace(' ', '0');
        }

        int i=0;
        int j=ans.length()-1;
        while( i < j ){
            if(ans.charAt(i) != ans.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
        
    }
}