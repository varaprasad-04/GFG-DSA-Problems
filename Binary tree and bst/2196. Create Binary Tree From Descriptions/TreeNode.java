 import java.util.*;
  public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }

class Solution {
    public TreeNode createBinaryTree(int[][] descriptions) {
        HashMap<Integer,TreeNode>s1=new HashMap<>();
        HashSet<Integer>s2=new HashSet<>();
        for(int i=0;i<descriptions.length;i++){
            int par=descriptions[i][0];
            int chi=descriptions[i][1];
            int side=descriptions[i][2];
            if(!s1.containsKey(par)){
                s1.put(par,new TreeNode(par));
            }
            if(!s1.containsKey(chi))s1.put(chi,new TreeNode(chi));

            if(side==1)s1.get(par).left=s1.get(chi);
            if(side==0)s1.get(par).right=s1.get(chi);

            s2.add(chi);
        }
        for(Map.Entry<Integer,TreeNode>e:s1.entrySet()){
            int k=e.getKey();
            if(!s2.contains(k))return e.getValue();
        }
        return null;
    }
    public static void main(String args[]){
        Solution obj = new Solution();
        int[][] descriptions = {{1,2,1},{1,3,0},{2,4,1}};
        TreeNode root = obj.createBinaryTree(descriptions);
        // You can add code here to print the tree or verify the structure
    }
}