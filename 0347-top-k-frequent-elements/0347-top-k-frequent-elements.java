class Solution {
    public class Pair{
        int a;
        int b;

        Pair(int a,int b){
            this.a=a;
            this.b=b;
        }
    }
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> h=new HashMap<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            h.put(nums[i],h.getOrDefault(nums[i],0)+1);
        }

        PriorityQueue<Pair> pq = new PriorityQueue<>((c, d) -> d.b - c.b);


        for (Map.Entry<Integer, Integer> e : h.entrySet()) {
    pq.add(new Pair(e.getKey(), e.getValue()));
}

         int ans[]=new int[k];
         for(int i=0;i<k;i++){
            ans[i]=pq.peek().a;
            pq.poll();
         }
         return ans;
    }
}