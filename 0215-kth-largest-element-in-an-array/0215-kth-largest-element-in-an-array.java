class Solution {
    public int findKthLargest(int[] arr, int k) {
        PriorityQueue<Integer> p = new PriorityQueue<>();
        for(int i=0;i<arr.length;i++){
            p.add(arr[i]);
            if(p.size() > k) p.poll();
        }
        
        return p.peek();
    }
}