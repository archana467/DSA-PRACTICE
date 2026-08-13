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
    List<List<Integer>> list1=new ArrayList<>();
    if(root==null){
        return list1;
    }
    int h=height(root);
    for(int i=0;i<h;i++){
        list1.add(new ArrayList<>());
    }
    dfs(root,0,list1);
    return list1;
    
    }
    public int height(TreeNode root){
        if(root==null){
            return 0;
        }
        int left =height(root.left);
        int right=height(root.right);
        return 1+Math.max(left,right);
    } 
    public void dfs(TreeNode root,int h,List<List<Integer>> list){
        if(root==null){
            return;
        }
        if(h%2==0){
            list.get(h).add(root.val);
        }
        else{
            list.get(h).add(0,root.val);
        }
       
        dfs(root.left,h+1,list);
        dfs(root.right,h+1,list);

    }
    
}