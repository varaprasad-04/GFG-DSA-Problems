class Solution {
    public int getLastDigit(String a, String b) {
        if(b.equals("0"))return 1;
        int[][] cycles = {
            {0},          // 0
            {1},          // 1
            {2,4,8,6},    // 2
            {3,9,7,1},    // 3
            {4,6},        // 4
            {5},          // 5
            {6},          // 6
            {7,9,3,1},    // 7
            {8,4,2,6},    // 8
            {9,1}         // 9
        };
        int l=a.charAt(a.length()-1)-'0';
        int cicle[]=cycles[l];
        int rem = 0;
        for(char ch : b.toCharArray()) {
            rem = (rem * 10 + (ch - '0')) % cicle.length;
        }

        if(rem == 0)
            return cicle[cicle.length - 1];

        return cicle[rem - 1];
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        String a = "2";
        String b = "10";
        int result = sol.getLastDigit(a, b);
        System.out.println(result); // Output: 4
    }
};