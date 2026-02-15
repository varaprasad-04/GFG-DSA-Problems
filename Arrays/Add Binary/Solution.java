class Solution {
    public String addBinary(String a, String b) {
        StringBuilder s1=new StringBuilder();
        int i=a.length()-1;
        int j=b.length()-1;
        int carry=0;
        while(i>=0 || j>=0 || carry==1){
            int sum=carry;
            if(i>=0){
                sum+=a.charAt(i)-'0';
                i--;
            }
            if(j>=0){
                sum+=b.charAt(j)-'0';
                j--;
            }
            s1.append(sum%2);
            carry=sum/2;
        }
        return s1.reverse().toString();
    }
    public static void main(String[] args) {
        Solution s=new Solution();
        String a="1010";
        String b="1011";
        System.out.println(s.addBinary(a, b));
    }
}