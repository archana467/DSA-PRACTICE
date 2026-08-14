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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {

    List<List<Integer>> list = new ArrayList<>(); 
    List<Integer> list1=new ArrayList<>();
    dfs(root,targetSum,list1,list);
    return list;

    }
    public void dfs(TreeNode root,int targetSum,List<Integer> list1,List<List<Integer>> list){
    
    if(root==null){
        return ;
    }
    list1.add(root.val);
    targetSum=targetSum-root.val;
    if(root.left==null && root.right==null){
        if(targetSum==0){
            list.add(new ArrayList<>(list1));
        }
    }
        else{
           dfs(root.left,targetSum,list1,list);
           dfs(root.right,targetSum,list1,list);

        }
        list1.remove(list1.size()-1);
    
   
    }
 
}