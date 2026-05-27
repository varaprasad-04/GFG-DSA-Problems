class Solution {
    public boolean wifiRange( String s, int x) {
        int n=s.length();
        int covered = -1;

        for (int i = 0; i < n; i++) {

            // room not covered
            if (i > covered) {

                boolean found = false;

                // search for router that can cover room i
                for (int j = Math.max(0, i - x);
                         j <= Math.min(n - 1, i + x);
                         j++) {

                    if (s.charAt(j) == '1') {

                        covered = j + x;
                        found = true;
                        break;
                    }
                }

                if (!found) return false;
            }
        }

        return true;
    }
    public static void main(String[] args) {
        Solution s=new Solution();
        String s1="10001";
        int x=1;
        boolean result = s.wifiRange(s1, x);
        System.out.println(result);
    }   
}