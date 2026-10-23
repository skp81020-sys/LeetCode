class Solution {
    public String[] largestString(int[] nums) {
        int m=nums.length;
        String ans[]=new String[m];
        for(int i=0;i<m;i++){
            String s="";
            long n=nums[i];
            while(n > 0){
               int a = (int) (Math.log(n) / Math.log(2));
               if(a >=25) s +='z';
               else s +=(char) ('a'+a);
               if(a >=25) n=n = n - (int) Math.pow(2, 25);
               else n = n - (int) Math.pow(2, a);
            }
            ans[i]=s;
        }
        return ans;
    }
}