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
    boolean ans =false;

    void hasPath(TreeNode root,int target,int sum ){
        if(root==null) return;
        //leaf node 
        sum +=root.val;
        if(root.left==null && root.right==null) {
            if(sum==target){
                ans =true;
                return;
            }
        }
        hasPath(root.left,target,sum);
        hasPath(root.right,target,sum);
    }
    public boolean hasPathSum(TreeNode root, int targetSum) {
        hasPath(root,targetSum,0);
        return ans;
    }
}