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

class ListNode{
    int val;
    ListNode next;
    ListNode(int val){
        this.val=val;
    }
}
class Solution {

    public ListNode middleNode(ListNode head) {
        ListNode p1=head;
        ListNode fp=head;
        ListNode sp=head;
        while(fp != null && fp.next!=null){
            fp=fp.next.next;
            sp=sp.next;
        }
        return sp;
    }
    
    public static void main(String[] args) {
        // Test the middleNode and middleNode2 methods
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        Solution solution = new Solution();
        ListNode middle1 = solution.middleNode(head);
        System.out.println("Middle node (method 1): " + middle1.val);

      
    }
}