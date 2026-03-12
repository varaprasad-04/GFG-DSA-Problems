 
  class ListNode {
    int val;
     ListNode next;
      ListNode(int x) {
         val = x;
         next = null;
    }
}

public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode p1=headA;
        ListNode p2=headB;
        while(p1!=p2){
            p1=(p1==null)?headB:p1.next;
            p2=(p2==null)?headA:p2.next;
        }
        return p2;
    }
    public static void main(String[] args) {
        // Test the getIntersectionNode method
        ListNode listA = new ListNode(1);
        listA.next = new ListNode(2);
        listA.next.next = new ListNode(3);

        ListNode listB = new ListNode(4);
        listB.next = new ListNode(5);
        listB.next.next = listA.next; // Create intersection at node with value 2

        Solution solution = new Solution();
        ListNode intersection = solution.getIntersectionNode(listA, listB);
        if (intersection != null) {
            System.out.println("Intersection at node with value: " + intersection.val);
        } else {
            System.out.println("No intersection found.");
        }
    }
}