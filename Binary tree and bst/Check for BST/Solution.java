
class Node {
    int data;
    Node left;
    Node right;

    Node(int val) {
        data = val;
        left = right = null;
    }
}


class Solution {
    public boolean helper(Node node, long min, long max) {
        if (node == null) return true;

        if (node.data <= min || node.data >= max) return false;

        return helper(node.left, min, node.data) &&
               helper(node.right, node.data, max);
    }
    public boolean isBST(Node root) {
        return helper(root,Long.MIN_VALUE,Long.MAX_VALUE);
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        Node root = new Node(2);
        root.left = new Node(1);
        root.right = new Node(3);
        boolean result = solution.isBST(root);
        System.out.println(result); // Output: true
    }
}