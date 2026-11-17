class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0) return false;
        int x1=x;
        int ans=0;
        while(x > 0){
            int r=x%10;
            ans =ans *10 +r;
            x=x/10;
        }
        System.out.println(ans);
        if(ans==x1) return true;
        return false;
    }
}