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
        List<List<Integer>> outlist = new ArrayList<>();
        if(root==null) return outlist;
        Queue<TreeNode> q =new LinkedList<>();
        q.add(root);
        boolean flag=false;
        while(!q.isEmpty()){
            int size=q.size();
            List<Integer> innlist=new ArrayList<>();
            while(size-->0){
                TreeNode node=q.remove();
                if(node!=null){
                    innlist.add(node.val);
                    if(node.left!=null){
                        q.add(node.left);
                    }
                    if(node.right!=null){
                        q.add(node.right);
                    }
                }
            }
            if(flag) Collections.reverse(innlist);
            flag=!flag;
            
            outlist.add(innlist);    
        }
        return outlist;
    }
}