class Solution {
    public int minRefuelStops(int target, int w, int[][] choice) {
         Arrays.sort(choice , (a,b) -> Integer.compare(a[0], b[0]));
           PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());

        int n=choice.length;
        int ans=0;
        int idx=0;
        while(w < target){

            while(idx < n &&  w >= choice[idx][0]){
                pq.add(choice[idx][1]);
                idx++;
            }  
            if (pq.isEmpty())  return -1;
            w +=pq.poll();  
            ans++;
        }

        return ans;
    }
}