class Solution {
    public int totalFruit(int[] fruits) {
       HashMap<Integer,Integer> hs=new HashMap<>();
        int ans =-1;
        int low =0;
        int high=0;
        int n=fruits.length;
        for(high=0;high<n;high++){
            int ch =fruits[high];
            hs.put(ch, hs.getOrDefault(ch, 0)+1);
            // update the value of k 
            if(hs.size() <= 2){
                int len =high-low+1;
                ans =Math.max(ans, len);
            }
            while(hs.size() > 2){
                int chl=fruits[low];
                 hs.put(chl, hs.getOrDefault(chl, 0)-1);
                 if(hs.get(chl)==0){
                    hs.remove(chl);
                 }
                 low++;
            }
        }
        return ans;
    }
}