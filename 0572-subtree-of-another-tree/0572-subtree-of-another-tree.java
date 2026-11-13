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
    // TreeNode same=null;
    // void Inorder(TreeNode root,TreeNode subRoot){
    //     if(root==null) return;
    //     if(root.val==subRoot.val) same =root;
    //     Inorder(root.left,subRoot);
    //     Inorder(root.right,subRoot);
    // }
    boolean subtree(TreeNode subroot,TreeNode same){
        if(same == null && subroot==null) return true;
         if(same == null || subroot==null) return false;
        if(same.val != subroot.val) return  false;

        return subtree(subroot.left,same.left) && subtree(subroot.right,same.right);
    }
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
         if(subRoot==null) return true;
         if(root==null) return false;

         if(subtree(root,subRoot)){
            return true;
         }

         return isSubtree(root.left,subRoot) || isSubtree(root.right,subRoot);
    }
}