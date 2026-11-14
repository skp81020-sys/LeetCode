/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    TreeNode Build(int nums[], int lo ,int hi){
        if(lo > hi ) return null;
        int mid=lo+(hi-lo)/2;
        TreeNode root=new TreeNode(nums[mid]);
        root.left=Build(nums,lo,mid-1);
        root.right=Build(nums,mid+1,hi);

        return root;
    }
    public TreeNode sortedArrayToBST(int[] nums) {
        int n=nums.length;
        int low=0;
        int hi=n-1;
        return Build(nums,low,hi);
    }
}