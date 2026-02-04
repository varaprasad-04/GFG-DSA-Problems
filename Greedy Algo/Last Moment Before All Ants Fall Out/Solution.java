class Solution {
    public int getLastMoment(int n, int left[], int right[]) {
        int max=0;
        for(int i=0;i<left.length;i++){
            max=Math.max(max,left[i]);
        }
        for(int i=0;i<right.length;i++){
            max=Math.max(max,n-right[i]);
        }
        return max;
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        int n = 4;
        int left[] = {4, 3};
        int right[] = {0, 1};
        System.out.println(sol.getLastMoment(n, left, right));
    }
}