import java.util.*; 
class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

class pair{
    Node p;
    int hd;
    pair(Node p,int hd){
        this.p=p;
        this.hd=hd;
    }
}

class Solution {
    public ArrayList<ArrayList<Integer>> verticalOrder(Node root) {
        ArrayList<ArrayList<Integer>>res=new ArrayList<>();
        Queue<pair>q=new LinkedList<>();
        TreeMap<Integer,ArrayList<Integer>>s1=new TreeMap<>();
        q.offer(new pair(root,0));
        while(!q.isEmpty()){
            pair r=q.poll();
            Node p=r.p;
            int hd=r.hd;
            if(!s1.containsKey(hd)){
                ArrayList<Integer> s3=new ArrayList<>();
                s3.add(p.data);
                s1.put(hd,s3);
            }
            else {
                s1.get(hd).add(p.data);
            }
            if(p.left!=null){
                q.offer(new pair(p.left,hd-1));
            }
            if(p.right!=null){
                q.offer(new pair(p.right,hd+1));
            }
            
        }
        for(Map.Entry<Integer,ArrayList<Integer>> e:s1.entrySet()){
            ArrayList<Integer> v=e.getValue();
            res.add(v);
        }
        return res;
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
        ArrayList<ArrayList<Integer>> result = s.verticalOrder(root);
        System.out.println(result);
    }
}