class Solution {
    public int maxConsecutiveAnswers(String answerKey, int k) {
      int t=0;
      int f=0;
      int high=0;
      int low =0;
      int window=0;
      for(high=0;high<answerKey.length();high++){
        if(answerKey.charAt(high)=='F') f++;
        else t++;
        int len=high-low+1;

        if(len-Math.max(t,f) > k){
             if(answerKey.charAt(low)=='F') f--;
             else t--;
             low++;
        }

        len=high-low+1;
        window=Math.max(len,window);
      }

      return window;
    }
}