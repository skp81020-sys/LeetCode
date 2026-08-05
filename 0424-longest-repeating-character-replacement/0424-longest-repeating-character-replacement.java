class Solution {
    public int characterReplacement(String s, int k) {
        int freq[]=new int[26];
        int left=0;
        int maxwindow=0;
        int maxfreq=0;
        for(int right=0;right<s.length();right++){
            // increse the freq
            freq[s.charAt(right)-'A']++;
            maxfreq=Math.max(maxfreq, freq[s.charAt(right)-'A']);
           int  windowlengt=right-left+1;
           
            if(windowlengt -maxfreq > k){
                freq[s.charAt(left)-'A']--;
                left++;
            }
            windowlengt=right-left+1;
            maxwindow=Math.max(windowlengt, maxwindow);
        }
        return  maxwindow;
    }
}