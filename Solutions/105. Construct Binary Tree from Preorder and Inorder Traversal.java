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
    int preIndex=0;
    public TreeNode helper(int[] preorder, int[] inorder,int inStart,int inEnd,Map<Integer,Integer> map){
        if(inStart>inEnd ){
            return null;        //Base Case
        }
        TreeNode root=new TreeNode(preorder[preIndex]);
        preIndex++;

        int inIndex=map.get(root.val);
        
        root.left=helper(preorder,inorder,inStart,inIndex-1,map);
        root.right=helper(preorder,inorder,inIndex+1,inEnd,map);
        return root;
    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<inorder.length;i++){
            map.put(inorder[i],i);
        }
        return helper(preorder,inorder,0,inorder.length-1,map);
    }
}













