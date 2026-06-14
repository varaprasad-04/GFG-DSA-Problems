import java.util.*;
 public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

class Solution {
    public int pairSum(ListNode head) {
        int c=0;
        ArrayList<Integer>s1=new ArrayList<>();
        while(head!=null){
            c++;
            s1.add(head.val);
            head=head.next;
        }
        int max=-1;
        int n=s1.size();
        for(int i=0;i<s1.size()/2;i++){
            max=Math.max(max,s1.get(i)+s1.get(n-1-i));
        }
       return max;
    }
    public static void main(String[] args) {
        Solution s=new Solution();
        ListNode head=new ListNode(5);
        head.next=new ListNode(4);
        head.next.next=new ListNode(2);
        head.next.next.next=new ListNode(1);
        System.out.println(s.pairSum(head));
    }
}