class Solution {
    
    public int[] searchRange(int[] nums, int target) {
        
        int ans[] = {-1, -1};

        // First occurrence
        int lo = 0;
        int hi = nums.length - 1;

        while (lo <= hi) {
            
            int mid = lo + (hi - lo) / 2;

            if (nums[mid] == target) {
                ans[0] = mid;
                hi = mid - 1;       // aur left jao
            }
            else if (nums[mid] > target) {
                hi = mid - 1;
            }
            else {
                lo = mid + 1;
            }
        }

        // Last occurrence
        lo = 0;
        hi = nums.length - 1;

        while (lo <= hi) {
            
            int mid = lo + (hi - lo) / 2;

            if (nums[mid] == target) {
                ans[1] = mid;
                lo = mid + 1;       // aur right jao
            }
            else if (nums[mid] > target) {
                hi = mid - 1;
            }
            else {
                lo = mid + 1;
            }
        }

        return ans;
    }
}