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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> result=new ArrayList<>();
        Queue<TreeNode> queue=new LinkedList<>();
        if(root==null) return result;
        queue.add(root);
        while(!queue.isEmpty()){
            List<Integer> ans= new ArrayList<>();
            int size=queue.size();
            for(int i=0;i<size;i++){
                TreeNode element=queue.remove();
                ans.add(element.val);
                if(element.left!=null){
                    queue.add(element.left);
                }
                if(element.right!=null){
                    queue.add(element.right);
                }
            }
            
            result.add(ans);
        }
        Collections.reverse(result);
        return result;
    }
}