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
    public int minDepth(TreeNode root) {
        //Using BFS
        Queue<TreeNode> q = new LinkedList<>();
        int count=0;
        if(root==null) return count;
        q.add(root);
        while(!q.isEmpty()){
            int size=q.size();
            count++;
            while(size-->0){
                TreeNode element=q.remove();
                if(element.left==null && element.right==null){
                    return count;
                }
                if(element.left!=null){
                    q.add(element.left);
                }
                if(element.right!=null){
                    q.add(element.right);
                }            
            }
        }
        return count;
    }
}