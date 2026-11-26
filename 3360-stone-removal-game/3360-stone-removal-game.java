class Solution {
    public boolean canAliceWin(int n) {
        int removestone =10;
        boolean Alice =true;

        while(n >= removestone &&  removestone > 0){
            n -=removestone;
            removestone--;
            Alice=!Alice;
        }

        return !Alice;
    }
}