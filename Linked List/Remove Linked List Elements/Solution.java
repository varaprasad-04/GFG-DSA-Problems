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
    public ListNode removeElements(ListNode head, int val) {
        ListNode p=head;
        ListNode prev=null;
        while( head!=null && head.val == val ){
            head=head.next;
           
        }
        p=head;

        while(p!=null ){
            if(p.val==val){
                prev.next=p.next;

            }
            else prev=p;

            p=p.next;
        }
        return head;
    }
}