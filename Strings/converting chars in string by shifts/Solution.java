import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int shift = in.nextInt();
        if (in.hasNextLine()) {
            in.nextLine();
        }
        String plaintext = in.nextLine();
        char ch[]=plaintext.toCharArray();
        for(int i=0;i<ch.length;i++){
            if(!Character.isLetter(ch[i]))continue;
            else{
                if(Character.isLowerCase(ch[i]))
                    ch[i]=(char)('a'+(ch[i]-'a'-shift+26)%26);
                else 
                    ch[i]=(char)('A'+(ch[i]-'A'-shift+26)%26);

            }
        }
        
        String ans=String.valueOf(ch);
        System.out.println(ans);
    }
}