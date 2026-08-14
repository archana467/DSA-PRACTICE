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
    int tsum=0;
    public int sumNumbers(TreeNode root) {
      dfs(root,0);
      return tsum;

    }

        public void dfs(TreeNode root,int sum){
            if(root==null){
                return ;
            }
            sum=sum*10+root.val;
            if(root.left==null && root.right==null){
                tsum+=sum;
            }
            dfs(root.left,sum);

            dfs(root.right,sum);
        }
        
    
}