import java.util.*;
class Solution {
    public ArrayList<Integer> constructList(int[][] queries) {
        // code here
        ArrayList<Integer>s1=new ArrayList<>();
        s1.add(0);
        int xorall=0;
        for(int i=0;i<queries.length;i++){
            int f=queries[i][0];
            int s=queries[i][1];
            if(f==0)s1.add(s^xorall);
            else{
                xorall^=s;
            }
        }
        for(int i=0;i<s1.size();i++){
            s1.set(i,s1.get(i)^xorall);
        }
        Collections.sort(s1);
        return s1;
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[][] queries = {{0, 5}, {1, 3}, {0, 2}, {1, 1}};
        ArrayList<Integer> result = sol.constructList(queries);
        System.out.println(result); // Output the result
    }   
}