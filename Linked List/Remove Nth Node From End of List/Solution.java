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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int c=0;
        ListNode p=head;
        while(p!=null){
            c++;
            p=p.next;
        } 
        int s=c-n;
        if(s==0){
           
            return head.next;
        }
        ListNode prev=null;
        p=head;
        while(p!=null && s>0){
            prev=p;
            p=p.next;
            s--;
        }
        prev.next=p.next;
        return head;
    }
    public static void main(String[] args) {
        // Create a linked list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        Solution solution = new Solution();
        ListNode newHead = solution.removeNthFromEnd(head, 2);
        // Print the modified linked list
        ListNode curr = newHead;
        while (curr != null) {
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
    }
}