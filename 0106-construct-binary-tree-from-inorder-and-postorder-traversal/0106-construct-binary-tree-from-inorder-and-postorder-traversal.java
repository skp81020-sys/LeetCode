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
    int idx;
    TreeNode Build(int[] preorder, int low ,int high, HashMap<Integer,Integer> in){
        // base case 
        if(low > high) return null;
        TreeNode root=new TreeNode(preorder[idx]);
        int mid=in.get((preorder[idx]));
         idx--;
     
          root.right=Build(preorder,mid+1,high,in);
             root.left=Build(preorder,low,mid-1,in);
        return root;
    }
    public TreeNode buildTree(int[] inorder, int[] postorder) {
         HashMap<Integer,Integer> in=new HashMap<>();
    int n=postorder.length;
    idx=n-1;
    for(int i=0;i<n;i++){
        in.put(inorder[i],i);
    }
    return Build(postorder,0,n-1,in);
    }
}