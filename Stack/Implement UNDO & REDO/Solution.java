import java.util.Stack;
class Solution {
    Stack<Character>ch=new Stack<>();
    Stack<Character> re=new Stack<>();
    public void append(char x) {
      ch.push(x);
    }

    public void undo() {
        
        if(!ch.isEmpty())
            re.push(ch.pop());
    }

    public void redo() {
       ch.push(re.peek());
       re.pop();
    }

    public String read() {
        StringBuilder sb = new StringBuilder();
        for (char c : ch) {
            sb.append(c);
        }
        return sb.toString();
    }
    public static void main(String args[]){
        Solution s=new Solution();
        s.append('a');
        s.append('b');
        s.append('c');
        System.out.println(s.read());
        s.undo();
        System.out.println(s.read());
        s.redo();
        System.out.println(s.read());
    }
}
