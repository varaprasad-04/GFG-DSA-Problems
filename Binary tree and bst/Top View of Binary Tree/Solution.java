import java.util.*; 
class Node {
    int data;
    Node left, right;

    Node(int val) {
        this.data = val;
        this.left = null;
        this.right = null;
    }
}

class pair{
    Node node;
    int hd;
    pair(Node node,int hd){
        this.node=node;
        this.hd=hd;
    }
}
class Solution {
    public ArrayList<Integer> topView(Node root) {
       ArrayList<Integer>s1=new ArrayList<>();
       Queue<pair>q=new LinkedList<>();
       TreeMap<Integer,Integer>s2=new TreeMap<>();
       q.offer(new pair(root,0));
       while(!q.isEmpty()){
             pair p=q.poll();
            Node node=p.node;
            int hd=p.hd;
            
            if(!s2.containsKey(hd)){
                s2.put(hd,node.data);
            }
            if(node.left!=null){
                q.add(new pair(node.left,hd-1));
            }
            if(node.right!=null){
                q.add(new pair(node.right,hd+1));
            }
       }
       for(int ele:s2.values()){
           s1.add(ele);
       }
       return s1;
    }
    public static void main(String[] args) {
        Solution s = new Solution();
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        ArrayList<Integer> result = s.topView(root);
        System.out.println(result);
    }
}