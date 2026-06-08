import java.util.*;
class Node {

    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

class Solution {
    Node compute(Node head) {
       Node p=head;
       ArrayList<Integer>s1=new ArrayList<>();
       while(p!=null){
           s1.add(p.data);
           p=p.next;
       }
       int max=s1.get(s1.size()-1);
       for(int i=s1.size()-2;i>=0;i--){
           if(max>s1.get(i))s1.remove(i);
           else max=s1.get(i);
       }
       Node h=new Node(s1.get(0));
       Node p1=h;
       for(int i=1;i<s1.size();i++){
           p1.next=new Node(s1.get(i));
           p1=p1.next;
       }
       return h;
       
    }
    public static void main(String args[]){
        Solution obj = new Solution();
        Node head = new Node(12);
        head.next = new Node(15);
        head.next.next = new Node(10);
        head.next.next.next = new Node(11);
        Node result = obj.compute(head);
        while (result != null) {
            System.out.print(result.data + " ");
            result = result.next;
        }
    }
}