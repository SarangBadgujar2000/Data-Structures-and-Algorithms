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
    public boolean check(TreeNode p1, TreeNode q1){
        if(p1==null && q1==null){
            return true;
        }
        if(p1==null || q1==null){
            return false;
        }
        if(p1.val!=q1.val){
            return false;
        }
        return check(p1.left,q1.left) && check(p1.right,q1.right);
    }
    public boolean isSameTree(TreeNode p, TreeNode q) {
        return check(p,q);
    }
}