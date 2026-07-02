class Solution{
public static String removeOuterParentheses(String s) {
    StringBuilder s1=new StringBuilder();
    int balance =0;
    for(int i=0;i<s.length();i++){
        char ch=s.charAt(i);
        if(ch==')')balance--;
        if(ch == '(' && balance==0){
            balance++;
            continue;
        }
        if(balance >0 && ch== '('){
            s1.append(ch);
            balance++;
        }
        if(ch==')' && balance <=0)continue;
        if(ch==')' && balance >0)s1.append(ch);
    }
    return s1.toString();
}
public static void main(String[] args) {
    String s = "(()())(())";
    System.out.println(removeOuterParentheses(s)); // Output: "()()()"
    }
}   
 
