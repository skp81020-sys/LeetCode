class Solution {
     public static int RotatedSortedArray(int arr[],int target,int si,int ei){
        
        while (si<= ei) {
            int mid=si+(ei-si)/2;
            if(arr[mid]==target){
                return mid;
            }
            // left Sorted 
            if(arr[si] <= arr[mid]){
                // Ab left ke liye 
                if(arr[si] <= target && arr[mid] > target){
                    // call left
                     return RotatedSortedArray(arr, target, si, mid-1);
                }
                else{
                    // Call Right
                    return RotatedSortedArray(arr, target, mid+1, ei);
                }
            }
            else{
                if(arr[mid] < target && arr[ei] >= target){
                    return   RotatedSortedArray(arr, target, mid+1, ei);
                }
                else{
                   return  RotatedSortedArray(arr, target, si, mid-1);
                }
            }

        }
        return -1;
    }
    public int search(int[] nums, int target) {
        return RotatedSortedArray(nums,target, 0, nums.length-1);
    }
}