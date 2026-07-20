class Solution {
    public int findKthLargest(int[] arr, int k) {
        int n=arr.length;
         PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int i=0;i<arr.length;i++){
            pq.add(arr[i]);
        }

        for(int i=0;i<n-k;i++){
            pq.remove();
        }
        return pq.peek();
    }
}