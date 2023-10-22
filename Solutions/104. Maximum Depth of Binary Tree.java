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
    int count=0;
    int max=0;
    public int depth(TreeNode root,int count,int max){
        if(root==null){
            return 0;
        }
               
        return 1+Math.max(depth(root.left,count,max),depth(root.right,count,max));
    }
    public int maxDepth(TreeNode root) {
        return depth(root,count,max);
    }
}