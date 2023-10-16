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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode curr1=list1;
        ListNode curr2=list2;
        if(curr1==null && curr2==null){
            return null;
        }
        ListNode dummy = new ListNode(0);
        ListNode curr=dummy;
        
        while(curr1!=null && curr2!=null){
            if(curr1.val<curr2.val){
                curr.val=curr1.val;
                curr1=curr1.next;
            }else{
                curr.val=curr2.val;
                curr2=curr2.next;
            }
            if(curr1!=null || curr2!=null){
                curr.next= new ListNode();
                curr=curr.next;
            }
        }
        if(curr1!=null){
            curr.val=curr1.val;
            curr.next=curr1.next;
        }
        if(curr2!=null){
            curr.val=curr2.val;
            curr.next=curr2.next;
        }
        System.gc();
        return dummy;
    }
}