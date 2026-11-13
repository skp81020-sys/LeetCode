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
    TreeNode first=null;
    TreeNode second=null;
    TreeNode prev=null;
    void InOrder(TreeNode root){
        if(root==null) return ;
        InOrder(root.left);
        if(prev==null){
            prev=root;
        }else if(prev.val >= root.val){
            if(first ==null) first=prev;
             second=root;
             prev=root;
        }else  prev=root;
        InOrder(root.right);
    }
    public void recoverTree(TreeNode root) {
        InOrder(root);
        int temp = first.val;
            first.val = second.val;
            second.val = temp;
        // System.out.println(first.val);
        //  System.out.print(second.val);
    }
}