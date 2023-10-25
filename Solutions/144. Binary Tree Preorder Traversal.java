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
  
    public List<Integer> preorderTraversal(TreeNode root) {  
        if(root==null) return new ArrayList<>();
        List<Integer> lst= preorderTraversal(root.left);
        List<Integer> rst= preorderTraversal(root.right);
        List<Integer> result = new ArrayList<>();
        result.add(root.val);

        for(int ele:lst){
            result.add(ele);
        }
        for(int ele:rst){
            result.add(ele);
        }
        
        return result;
    }
}