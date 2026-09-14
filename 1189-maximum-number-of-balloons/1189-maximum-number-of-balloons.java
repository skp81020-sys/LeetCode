class Solution {
    public int maxNumberOfBalloons(String s) {
        String target="balloon";
         HashMap<Character,Integer> hs=new HashMap<>();
         HashMap<Character,Integer> t=new HashMap<>();
        if(target.length() > s.length()) return 0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            hs.put(ch,hs.getOrDefault(ch,0)+1);
        }

        for(int i=0;i<target.length();i++){
            char ch=target.charAt(i);
            t.put(ch,t.getOrDefault(ch,0)+1);
        }

        int ans =Integer.MAX_VALUE;
        for(int i=0;i<target.length();i++){
            char ch=target.charAt(i);
            if (!hs.containsKey(ch)) return 0;
            ans =Math.min(ans, hs.get(ch)/t.get(ch));
        }

        return ans;
    }
}