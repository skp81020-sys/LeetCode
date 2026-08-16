class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        int ans=0;
        int low =0;
        int hight=0;
        HashSet<Character> set=new HashSet<>();

        for(hight =0;hight<n;hight++){
           char ch=s.charAt(hight);
           if(!set.contains(ch)){
                set.add(ch);
                int len=hight-low+1;
                ans =Math.max(ans, len);
           }else{
                while(set.contains(ch)){
                    char chl=s.charAt(low);
                    set.remove(chl);
                    low++;
                }
           }
           set.add(ch);
        }
        return  ans;
    }
}