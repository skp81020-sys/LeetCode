class Solution {
    public boolean canConstruct(String r , String m) {
        HashMap<Character,Integer> hs =new HashMap<>();
        for(int i=0;i<m.length();i++){
            char ch=m.charAt(i);
            hs.put(ch,hs.getOrDefault(ch,0)+1);
        }

         for(int i=0;i<r.length();i++){
            char ch=r.charAt(i);
           if (hs.containsKey(ch) && hs.get(ch) > 0) {
                 hs.put(ch,hs.getOrDefault(ch,0)-1);
            }else return false;
        }

        return true;
    }
}