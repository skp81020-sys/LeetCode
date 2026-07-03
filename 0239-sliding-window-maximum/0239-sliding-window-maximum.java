class Solution {
    public  static class window implements Comparable<window>{
        int idx;
        int value;
        window(int idx,int value){
            this.idx=idx;
            this.value=value;
        }
        @Override
        public int compareTo(window w2){
            return this.value-w2.value;
        }
    }
    public int[] maxSlidingWindow(int[] arr, int k) {
         PriorityQueue<window> pq=new PriorityQueue<>(Collections.reverseOrder());
        int ans[]=new int[arr.length-k+1];
        int a=0;
        // Create  1st window
        for(int i=0;i<k;i++){
            pq.add(new window(i, arr[i]));
        }
         ans[a++]=pq.peek().value;
        for(int i=k;i<arr.length;i++){
            while(pq.size()> 0 && pq.peek().idx<=(i-k)) {
                pq.remove();
            }
            pq.add(new window(i, arr[i]));
             ans[a++]=pq.peek().value;
        }
        // Print the ans 
        // for(int i=0;i<ans.length;i++){
        //     System.out.print(ans[i]);
        // }
        return ans;
    }
}