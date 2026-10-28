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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
         List<List<Integer>> ans=new ArrayList<>();
         if(root==null) return ans;
         Queue<TreeNode> q = new LinkedList<>();
         q.offer(root);
         while(!q.isEmpty()){
            int s=q.size();
            List<Integer> a=new ArrayList<>();
            while(s > 0){
                TreeNode temp=q.poll();
                a.add(temp.val);
                if(temp.left!=null) q.offer(temp.left);
                if(temp.right!=null) q.offer(temp.right);
                s--;
            }
            ans.add(a);
         }
         int n=ans.size();
         for(int i=0;i<n;i++){
            if(i % 2 !=0){
                Collections.reverse(ans.get(i));
            }
         }
         return  ans;
    }
}