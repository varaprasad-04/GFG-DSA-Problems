
 //Definition for singly-linked list.
class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
 
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0)
            return head;
        ListNode cur=head;
        int n=1;
        while(cur.next!=null){
            cur=cur.next;
            n++;
        }
        cur.next=head;
        k=k%n;
        int p=n-k-1;
        ListNode tail=head;
        for(int i=0;i<p;i++){
            tail=tail.next;
        }
        ListNode newhead=tail.next;
        tail.next=null;

        return newhead;
    }
    public static void main(String[] args) {
        ListNode head=new ListNode(1);
        head.next=new ListNode(2);
        head.next.next=new ListNode(3);
        head.next.next.next=new ListNode(4);
        Solution solution = new Solution();
        ListNode newHead = solution.rotateRight(head, 2);
        while (newHead != null) {
            System.out.print(newHead.val + " ");
            newHead = newHead.next;
        }
    
    }
}