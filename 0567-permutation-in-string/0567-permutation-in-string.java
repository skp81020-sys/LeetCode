class Solution {
    public static boolean Sahi(int a[],int b[]){
        for(int i=0;i<256;i++){
            if(a[i] > b[i]) return false;
        }
        return true;
    }
    public boolean checkInclusion(String s1, String s2) {
        int s1a[]=new int[256];
        int s2a[]=new int[256];
        if(s1.length() > s2.length()) return false;
        for(int i=0;i<s1.length();i++){
            s1a[s1.charAt(i)]++;
        }

        int k=s1.length();
        for(int i=0;i<k-1;i++){
            s2a[s2.charAt(i)]++;
        }

        int low=0;
        int high=k-1;
        for(high=k-1;high<s2.length();high++){
             s2a[s2.charAt(high)]++;
             if(Sahi(s1a,s2a)){
                return true;
             }
              s2a[s2.charAt(low)]--;
              low++;
        }

        return false;
    }
}