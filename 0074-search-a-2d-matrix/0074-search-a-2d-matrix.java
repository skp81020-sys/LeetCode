class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
          int row=0; 
          int n=matrix.length; 
          int m=matrix[0].length; 
          int lo=0; int hi=n-1;
        while(lo <= hi ){ 
            int mid =lo+(hi-lo)/2;
               if(matrix[mid][0] <= target && matrix[mid][m-1] >= target){
                 row=mid;
                 break;
               }else if(matrix[mid][0] < target) lo=mid+1;
               else hi=mid-1;
        }

        lo=0;
        hi=m-1;
        while(lo <=hi){
            int mid=lo +(hi-lo)/2;
            if(matrix[row][mid]==target) return true;
            else if(matrix[row][mid] < target) lo =mid+1;
            else hi=mid-1;
        }

        return false;
    }
}