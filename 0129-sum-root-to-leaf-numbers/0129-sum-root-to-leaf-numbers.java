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
      void hasPath(TreeNode root, List<Integer> a,  List<List<Integer>> ans){
        if(root==null) return;
        a.add(root.val);
        // sum +=root.val;
        if(root.left == null && root.right==null){
            // if(sum==targetSum) {
                ans.add(new ArrayList<>(a));   
            // }
        }
             else {
            hasPath(root.left ,a,ans) ; 
            hasPath(root.right,a,ans);
             }
        
         
         a.remove(a.size() - 1);
    }
    public int sumNumbers(TreeNode root) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> a=new ArrayList<>();

         hasPath(root,a,ans);
         int c=0;
        for(int i=0;i<ans.size();i++){
            int b=0;
            for(int j=0;j<ans.get(i).size();j++){
                b =b *10 + ans.get(i).get(j);
            }
            c  +=b;
        }

        return c;
    }
}