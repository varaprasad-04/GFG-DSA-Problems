import java.util.*;
class Solution {
    public void rearrangeQueue(Queue<Integer> q) {
        Queue<Integer>s1=new LinkedList<>();
        Queue<Integer>s2=new LinkedList<>();
        int n=q.size()/2;
        while(!q.isEmpty()){
            if(s1.size()<n){
                s1.add(q.poll());
            }
            else s2.add(q.poll());
        }
        while(n!=0){
            q.add(s1.poll());
            q.add(s2.poll());
            n--;
        }
    }
    public static void main(String args[]){
        Solution s=new Solution();
        Queue<Integer> q=new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        s.rearrangeQueue(q);
        System.out.println(q);
    }
}
