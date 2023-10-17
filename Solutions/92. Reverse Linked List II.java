/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode left,ListNode right){
        ListNode pre=null;
        ListNode curr=left;
        ListNode next=null;
        while(curr!=right){
            next=curr.next;
            curr.next=pre;
            pre=curr;
            curr=next;
        }
        next=curr.next;
        curr.next=pre;
        pre=curr;
        return pre;

    }
    public ListNode reverseBetween(ListNode head, int l, int r) {
        if(l==r) return head;
        ListNode curr=head;
        ListNode pre=null;
        ListNode left=null;
        ListNode right=null;
        ListNode leftPre=null;
        ListNode rightNext=null;
        int count=1;

        while(curr!=null){
            if(l==count){
                leftPre=pre;
                left=curr;
            }
            if(r==count){
                right=curr;
                rightNext=curr.next;
            }
            count++;
            pre=curr;
            curr=curr.next;
        }
        if(leftPre==null){
            head=reverseList(left,right);
        }else{
            leftPre.next=reverseList(left,right);
        }
        if(rightNext!=null){
            left.next=rightNext;
        }
        return head;
    }
}