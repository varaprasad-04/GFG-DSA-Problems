
  class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
 
class Solution {
    public ListNode swapPairs(ListNode head) {
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode p=dummy;
        while(p.next!=null && p.next.next!=null){
            ListNode first = p.next;
            ListNode second = p.next.next;

            first.next = second.next;
            second.next = first;
            p.next = second;
            p=p.next.next;
        }
        
        return dummy.next;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4))));
        ListNode newHead = solution.swapPairs(head);
        while (newHead != null) {
            System.out.print(newHead.val + " ");
            newHead = newHead.next;
        }
    }

}