class Solution {
     public static boolean Sahi(int a[],int b[]){
        for(int i=0;i<256;i++){
            if(a[i] > b[i]) return false;
        }
        return true;
    }
    public List<Integer> findAnagrams(String s, String p) {
         List<Integer> ans =new ArrayList<>();
        if(p.length() > s.length()) return ans;
        int needed[]=new int[256];
        int have[]=new int[256];

        for(int i=0;i<p.length();i++){
            needed[p.charAt(i)]++;
        }

        for(int i=0;i<p.length()-1;i++){
            have[s.charAt(i)]++;
        }
        int low=0;
        int high=p.length();
       

        for(high=p.length()-1;high<s.length();high++){
            have[s.charAt(high)]++;
            if(Sahi(needed,have)){
                ans.add(low);
            }
             have[s.charAt(low)]--;
             low++;
        }

        return ans;
    }
}