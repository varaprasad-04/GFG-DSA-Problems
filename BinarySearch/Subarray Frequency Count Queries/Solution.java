import java.util.*;
class Solution {
    int lowerbound(int st,ArrayList<Integer> s1){
        int l=0,h=s1.size()-1;
        while(l<=h){
            int m=(l+h)/2;
           
            if(s1.get(m)>=st)h=m-1;
            else l=m+1;
        }
        return l;
    }
    int upperbound(int end,ArrayList<Integer> s1){
        int l=0,h=s1.size()-1;
        while(l<=h){
            int m=(l+h)/2;
            
            if(s1.get(m)<=end)l=m+1;
            else h=m-1;
        }
        return l;
    }
    public ArrayList<Integer> freqInRange(int[] arr, int[][] queries) {
      ArrayList<Integer>ans=new ArrayList<Integer>();
      HashMap<Integer,ArrayList<Integer>>s1=new HashMap<>();
      for(int i=0;i<arr.length;i++){
          if(s1.containsKey(arr[i])){
              s1.get(arr[i]).add(i);
          }
          else{
              ArrayList<Integer> s3=new ArrayList<>();
              s3.add(i);
              s1.put(arr[i],s3);
          }
      }
          for(int i=0;i<queries.length;i++){
              int st=queries[i][0];
              int end=queries[i][1];
              int ele=queries[i][2];
              ArrayList<Integer> s2=s1.get(ele);
              if(s2==null){
                  ans.add(0);
              }
              else{
                 int low=lowerbound(st,s2);
                 int upper=upperbound(end,s2);
                 ans.add(upper-low);
              }
              
          }
      
      return ans;
    }
    public static void main(String args[]){
        
    }
}