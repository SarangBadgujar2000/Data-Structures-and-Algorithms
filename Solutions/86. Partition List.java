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
    public ListNode partition(ListNode head, int x) {
        if(head==null || head.next==null) return head;
        ListNode dummy = new ListNode(0);
        ListNode pre=dummy;
        pre.next=head;
        ListNode curr=head;
        ListNode tail=head;
        while(tail.next!=null){
            tail=tail.next;
        }
        curr=head;
        ListNode oldtail=tail;
        while(curr!=oldtail){
            if(curr.val>=x){
                pre.next=curr.next;
                tail.next=curr;
                curr.next=null;
                tail=curr;
                curr=pre.next;
            }else{
                pre=pre.next;
                curr=curr.next;
            }
                
            
        }
        if(curr.val>=x && curr!=tail){
            pre.next=curr.next;
            tail.next=curr;
            curr.next=null;
            // tail=curr;
            // pre.next=curr;
        }
        return dummy.next;
    }
}