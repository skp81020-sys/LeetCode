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
    Stack<TreeNode> asc=new Stack<>();
    Stack<TreeNode> des=new Stack<>();
    TreeNode getSamll(){
        if(asc.isEmpty()) return null;
        TreeNode small=asc.pop();
        TreeNode right=small.right;
        // asc.pop();
        while(right !=null){
            asc.push(right);
            right=right.left;
        }

        return small;
    }


     TreeNode getBig(){
        if(des.isEmpty()) return null;
        TreeNode  big=des.pop();
        TreeNode left=big.left;
        // des.pop();
        while(left !=null){
             des.push(left);
             left=left.right;

        }

        return big;
    }



    public boolean findTarget(TreeNode root, int k) {
        TreeNode t=root;
        // Acesnding ke liye 
        while(t !=null){
            asc.push(t);
            t=t.left;
        }

        // Desending ke liye 
        t=root;
        while(t !=null){
            des.push(t);
            t=t.right;
        }

        TreeNode i=getSamll();
        TreeNode j=getBig();
        while(i !=null && j !=null && i !=j && i.val < j.val){
            int sum = i.val + j.val;
            System.out.println(sum);
            if(sum==k) return true;
            if(sum < k ){
               i=getSamll();
            }else j=getBig();
        }

        return false;
    }
}