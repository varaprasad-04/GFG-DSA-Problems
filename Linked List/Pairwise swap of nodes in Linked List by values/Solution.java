class Node {

        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
}

class Solution {
    public Node pairwiseSwap(Node head) {
         Node curr = head;

        // Traverse the list and swap data in pairs
        while (curr != null && curr.next != null) {
            
            // Swap data of current node and the next node
            int temp = curr.data;
            curr.data = curr.next.data;
            curr.next.data = temp;

            // Move to the next pair
            curr = curr.next.next;
        }
        return head;
    }
    public static void main(String[] args) {
        // Create a linked list: 1 -> 2 -> 3 -> 4
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);

        Solution solution = new Solution();
        head = solution.pairwiseSwap(head);

        // Print the swapped linked list
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
    }   
}