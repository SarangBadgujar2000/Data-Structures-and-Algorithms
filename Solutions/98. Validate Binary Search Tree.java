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
// class Solution {
//     TreeNode pre=null;
//     public boolean isValidBST(TreeNode root) {
//         if(root!=null){
//             if(!isValidBST(root.left)){
//                 return false;
//             }
//             if(pre!=null && root.val<=pre.val){
//                 return false;
//             }
//             pre=root;
//             return isValidBST(root.right);
//         }
//         return true;
//     }
// }
// class Solution {
//     long pre=Long.MIN_VALUE;
//     public boolean inOrder(TreeNode root){
//         if(root!=null){
//             if(!inOrder(root.left)){
//                 return false;
//             }
//             if(root.val<=pre){
//                 return false;
//             }
//             pre=root.val;
//             return inOrder(root.right);
//         }
//         return true;
//     }
//     public boolean isValidBST(TreeNode root) {
//         return inOrder(root);
//     }
// }
class Solution {
    public boolean helper(TreeNode root,long min,long max){
        if(root==null){
            return true;
        }
        if(root.val<=min || root.val>=max){
            return false;
        }
        return (helper(root.left,min,root.val) && helper(root.right,root.val,max));
    }
    public boolean isValidBST(TreeNode root) {
        return helper(root,Long.MIN_VALUE,Long.MAX_VALUE);
    }
}