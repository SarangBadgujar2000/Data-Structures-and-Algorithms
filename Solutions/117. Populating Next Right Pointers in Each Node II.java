/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        Node currlevel=root;
        while(currlevel!=null){
            Node dummy=new Node(0);
            Node pre=dummy;
            Node curr=currlevel;
            while(curr!=null){
                if(curr.left!=null){
                    pre.next=curr.left;
                    pre=pre.next;
                }
                if(curr.right!=null){
                    pre.next=curr.right;
                    pre=pre.next;
                }
                curr=curr.next;
            }
            currlevel=dummy.next;
        }
        return root;
    }
}