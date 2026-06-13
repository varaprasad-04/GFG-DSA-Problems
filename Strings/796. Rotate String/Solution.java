class Solution {
    public boolean rotateString(String s, String goal) {
        int i=0,n=s.length();
        while(i<n){
            s=s.substring(1)+s.charAt(0);
            if(s.equals(goal))return true ;
            i++;
        }
        return false;
    }
    public static void main(String[] args) {
        Solution s=new Solution();
        System.out.println(s.rotateString("abcde","cdeab"));
    }   
}

/*
class Solution {
    public boolean rotateString(String s, String goal) {

        if (s.length() != goal.length()) {
            return false;
        }

        String doubled = s + s;

        return doubled.contains(goal);
    }
} */