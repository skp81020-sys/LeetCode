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
    void hasPath(TreeNode root, int targetSum,int sum ,List<Integer> a,  List<List<Integer>> ans){
        if(root==null) return;
        a.add(root.val);
        sum +=root.val;
        if(root.left == null && root.right==null){
            if(sum==targetSum) {
                ans.add(new ArrayList<>(a));   
            }
        }
             else {
            hasPath(root.left , targetSum ,sum,a,ans) ; 
            hasPath(root.right , targetSum ,sum,a,ans);
             }
        
         
         a.remove(a.size() - 1);
    }
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> a=new ArrayList<>();

         hasPath(root,targetSum ,0,a,ans);

         return ans;

    }
}