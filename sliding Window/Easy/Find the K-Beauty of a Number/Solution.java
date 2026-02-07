class Solution {
    public int divisorSubstrings(int num, int k) {
        String s=Integer.toString(num);
        int c=0,n=s.length();
        for(int i=0;i<n-k+1;i++){
            StringBuilder s1=new StringBuilder();
            for(int j=i;j<i+k;j++){
                s1.append(s.charAt(j));
            }
            int n1=Integer.parseInt(s1.toString());
            if(n1!=0 && num%n1==0)c++;
        }
        return c;
    }
    public static void main(String args[]){
        Solution s=new Solution();
        int num=240, k=2;
        int result=s.divisorSubstrings(num,k);
        System.out.println(result);
    }
}