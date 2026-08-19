class Solution {
     public static boolean  Sahi(int have[],int needed[]){
        for(int i=0;i<256;i++){
            if(needed[i] > have[i]) return false;
        }

        return true;
    }
    public String minWindow(String s, String t) {
        int needed[]=new int[256];
        int have[]=new int[256];
        for(int i=0;i<t.length();i++){
            needed[t.charAt(i)]++;
        }
        int low =0;
        int high=0;
        int start=0;
        int res=Integer.MAX_VALUE;

        for(high=0;high<s.length();high++){
            have[s.charAt(high)]++;

            while (Sahi(have,needed)) { 
                if(res > high-low+1){
                    res=high-low+1;
                    start=low;
                }
                have[s.charAt(low)]--;
                low++;
            }
        }

        if(res==Integer.MAX_VALUE) return "";
        return s.substring(start,res+start);
    }
}