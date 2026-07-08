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
    public int minDepth(TreeNode root) {
        if(root==null) return 0;

        int lf=minDepth(root.left);
        int rf=minDepth(root.right);

        if(Math.min(lf,rf)+1==1){
            return Math.max(lf,rf)+1;
        }

        return Math.min(lf,rf)+1;
    }
}