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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode curr=dummy;
        ListNode temp1=l1;
        ListNode temp2=l2;
        int carry=0;

        while(temp1!=null ||temp2!=null){
            if(temp1!=null){
                curr.val=curr.val+temp1.val;
                temp1=temp1.next;
            }
            if(temp2!=null){
                curr.val=curr.val+temp2.val;
                temp2=temp2.next;
            }
            if(curr.val>=10){
                carry=curr.val/10;
            }else{
                carry=0;
            }
            curr.val=curr.val%10;
            if(temp1!=null || temp2!=null){
                curr.next= new ListNode(carry);
                curr=curr.next;
            }
        }      
        if(carry>=1){
            curr.next=new ListNode(carry);
        }
        
        return dummy;
    }
}