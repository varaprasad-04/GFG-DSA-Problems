import java.util.*;
class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

class Solution {
    public ListNode deleteMiddle(ListNode head) {
        ListNode sp=head;
        ListNode fp=head;
        ListNode prev=sp;
        if(head.next==null)return null;
        if(head.next.next==null){
            head.next=null;
            return head;
        }
        while(fp.next!=null && fp.next.next!=null){
            prev=sp;
            sp=sp.next;
            fp=fp.next.next;
        }
        if(fp.next!=null){
            prev=sp;
            sp=sp.next;
        }
        prev.next=sp.next;
        return head;


    }
    public static void main(String[] args) {
        Solution s=new Solution();
        ListNode head=new ListNode(1);
        head.next=new ListNode(3);
        head.next.next=new ListNode(4);
        head.next.next.next=new ListNode(7);
        head.next.next.next.next=new ListNode(1);   
    }
}