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
    
    public ListNode mergerLists(ListNode head1,ListNode head2){
        if(head1==null && head2==null) return null;
        ListNode curr=new ListNode(-1);
        ListNode dummy=curr;
        while(head1!=null && head2!=null){
            if(head1.val<=head2.val){
                curr.next=head1;
                curr=curr.next;
                head1=head1.next;
            }else{
                curr.next=head2;
                curr=curr.next;
                head2=head2.next;
            }
        }
        if(head1!=null){
            curr.next=head1;
            curr=curr.next;
        }
        if(head2!=null){
            curr.next=head2;
            curr=curr.next;
        }   
        return dummy.next;    
    }
    public ListNode divide(ListNode[] lists,int l,int r){
        if(l>=r) return lists[l];
        int mid=l+(r-l)/2;
        ListNode head1=divide(lists,l,mid);
        ListNode head2=divide(lists,mid+1,r);

        return mergerLists(head1,head2);
    }
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length==0) return null;
        return divide(lists,0,lists.length-1);
    }
}