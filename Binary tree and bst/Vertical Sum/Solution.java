import java.util.*;
class Node{
    int data;
    Node left, right;
    Node(int item)
    {
        data = item;
        left = right = null;
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
    public ArrayList<Integer> verticalSum(Node root) {
        ArrayList<Integer>ans=new ArrayList<>();
        TreeMap<Integer,Integer>s2=new TreeMap<>();
        Queue<pair>s1=new LinkedList<>();
        s1.add(new pair(root,0));
        while(!s1.isEmpty()){
            pair p1=s1.poll();
            Node n=p1.p;
            int hd=p1.hd;
            if(!s2.containsKey(hd)){
                s2.put(hd,n.data);
            }
            else{
                int v=s2.get(hd);
                s2.put(hd,v+n.data);
            }
            if(n.left!=null){
                s1.add(new pair(n.left,hd-1));
            }
            if(n.right!=null){
                s1.add(new pair(n.right,hd+1));
            }
            
        }
        for(Map.Entry<Integer,Integer>e:s2.entrySet()){
            int v=e.getValue();
            ans.add(v);
        }
        return ans;
    }
    public static void main(String[] args) {
        Solution sol=new Solution();
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        ArrayList<Integer>result=sol.verticalSum(root);
        System.out.println(result);
    }
}
















