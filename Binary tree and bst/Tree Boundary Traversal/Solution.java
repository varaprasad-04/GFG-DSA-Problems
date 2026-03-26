import java.util.*;
class Node {
int data;
Node left, right;

    public Node(int d) {
        data = d;
        left = right = null;
    }

}

class Solution {
boolean isleaf(Node root){
return root.left==null && root.right==null;
}
void leftchild(Node root,ArrayList<Integer> res){
if(root==null)return;
if(isleaf(root))return;

        res.add(root.data);

        if(root.left!=null){
            leftchild(root.left,res);
        }
        else leftchild(root.right,res);
    }

    void rightchild(Node root,ArrayList<Integer> res){

        ArrayList<Integer> temp = new ArrayList<>();

            while (root != null) {
                if (!isleaf(root)) {
                    temp.add(root.data);
                }

                if (root.right != null) {
                    root = root.right;
                } else {
                    root = root.left;
                }
            }

        for(int i=temp.size()-1;i>=0;i--){
        res.add(temp.get(i));
        }
    }

void leafs(Node root, ArrayList<Integer> res){
if(root == null) return;

    Stack<Node> stack = new Stack<>();
    stack.push(root);

    while(!stack.isEmpty()){
        Node curr = stack.pop();

        if(isleaf(curr)){
            res.add(curr.data);
        }

        // push right first so left is processed first
        if(curr.right != null) stack.push(curr.right);
        if(curr.left != null) stack.push(curr.left);
    }

}
ArrayList<Integer> boundaryTraversal(Node root) {
ArrayList<Integer>res=new ArrayList<>();
if(root==null)return res;
if(!isleaf(root)){
res.add(root.data);
}
leftchild(root.left,res);
leafs(root,res);
rightchild(root.right,res);

     return res;
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);  
    }

}
