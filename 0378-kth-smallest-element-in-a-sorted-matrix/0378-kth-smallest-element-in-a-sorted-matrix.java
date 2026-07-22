class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int n=matrix.length;
        int m=matrix[0].length;
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                pq.add(matrix[i][j]);
            }
        } 
        for(int i=1;i<k;i++){
            pq.remove();
        }
        return pq.peek();
    }
}