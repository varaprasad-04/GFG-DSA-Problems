import java.util.*;
class Solution {
    public String[] findRelativeRanks(int[] score) {
        PriorityQueue<Integer>s1=new PriorityQueue<>(Collections.reverseOrder());
        for(int ele:score){
            s1.add(ele);
        }
        String arr[]=new String[score.length];
        int k=0;
        while(!s1.isEmpty()){
            int top=s1.poll();
            k++;
            for(int i=0;i<score.length;i++){
                if(score[i]==top){
                    if(k==1)arr[i]="Gold Medal";
                    else if(k==2)arr[i]="Silver Medal";
                    else if(k==3)arr[i]="Bronze Medal";
                    else arr[i]=String.valueOf(k);
                }
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int n=5;
        int arr[]={5,4,3,2,1};
        Solution s=new Solution();
        String result[]=s.findRelativeRanks(arr);
        System.out.println(Arrays.toString(result));
    }
   
}