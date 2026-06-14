import java.util.*;

class Solution {
    public List<Integer> exitPoint(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;

        int i = 0, j = 0;
        int dir = 0; // 0=Right, 1=Down, 2=Left, 3=Up

        while (i >= 0 && i < n && j >= 0 && j < m) {

            if (mat[i][j] == 1) {
                dir = (dir + 1) % 4; // turn clockwise
                mat[i][j] = 0;       // update cell to 0
            }

            if (dir == 0) {
                j++;
            } else if (dir == 1) {
                i++;
            } else if (dir == 2) {
                j--;
            } else {
                i--;
            }
        }

        // move back to last valid cell
        if (i < 0) i++;
        else if (i >= n) i--;

        if (j < 0) j++;
        else if (j >= m) j--;

        return Arrays.asList(i, j);
    }
}