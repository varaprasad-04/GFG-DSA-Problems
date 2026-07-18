import java.util.Arrays;
class Solution {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        int c=0;
        int n = citations.length;
        for(int i=n-1;i>=0;i--){
            if(citations[i]>=n - i)c++;
            else break;
        }
        return c;
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] citations = {3, 0, 6, 1, 5};
        System.out.println(sol.hIndex(citations)); // Output: 3
    }
}