import java.util.Arrays;
class Solution {
    public String findLargest(int[] arr) {
        String str[]=new String[arr.length];
        int i=0;
        for(int ele:arr){
            str[i++]=String.valueOf(ele);
        }
        Arrays.sort(str,(a,b)->(b+a).compareTo(a+b));
        StringBuilder res=new StringBuilder();
        if(str[0].equals("0"))return "0";
        for(String s:str){
            res.append(s);
        }
        return res.toString();
    }
    public static void main(String[] args) {
        Solution sol=new Solution();
        int arr[]={3,30,34,5,9};
        System.out.println(sol.findLargest(arr));
    }
}