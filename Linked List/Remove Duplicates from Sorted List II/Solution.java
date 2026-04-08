 class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
 
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null)return null;
       ListNode dummy=new ListNode(0);
       dummy.next=head;
       ListNode prev=dummy;
       ListNode cur=head;
       while(cur !=null){
             if(cur.next!=null && cur.val==cur.next.val){
                while(cur.next!=null && cur.val==cur.next.val){
                    cur=cur.next;
                }
                prev.next=cur.next;
             }
             else prev=prev.next;

             cur=cur.next;
       }
       return dummy.next;

    }

    public static void main(String[] args) {
        ListNode head=new ListNode(1);
        head.next=new ListNode(2);
        head.next.next=new ListNode(3);
    }
}