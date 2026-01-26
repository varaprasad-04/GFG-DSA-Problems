import java.util.ArrayList;
class Solution {
    static  void possible(int[] arr,ArrayList<Integer>s1,boolean freq[], ArrayList<ArrayList<Integer>> ans){
        if(s1.size()==arr.length){
            ans.add(new ArrayList<>(s1));
            return;
        }
        for(int i=0;i<arr.length;i++){
            if(!freq[i]){
                s1.add(arr[i]);
                freq[i]=true;
                possible(arr,s1,freq,ans);
                s1.remove(s1.size()-1);
                freq[i]=false;
            }
        }
    }
    public static ArrayList<ArrayList<Integer>> permuteDist(int[] arr) {
       ArrayList<ArrayList<Integer>> ans=new  ArrayList<ArrayList<Integer>>();
       ArrayList<Integer>s1=new ArrayList<>();
       boolean freq[]=new boolean[arr.length];
       
       possible(arr,s1,freq,ans);
       return ans;
    }
    public static void main(String args[]){
        Solution s=new Solution();
        int arr[]={1,2,3};
        ArrayList<ArrayList<Integer>> result=s.permuteDist(arr);
        System.out.println(result);
    }
};