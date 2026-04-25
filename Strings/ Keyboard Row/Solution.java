import java.util.*;

class Solution {
    public String[] findWords(String[] words) {
        // Define keyboard rows
        String row1 = "qwertyuiop";
        String row2 = "asdfghjkl";
        String row3 = "zxcvbnm";

        List<String> result = new ArrayList<>();

        for (String word : words) {
            String lower = word.toLowerCase();

            // Identify which row the first character belongs to
            String row;
            if (row1.indexOf(lower.charAt(0)) != -1) {
                row = row1;
            } else if (row2.indexOf(lower.charAt(0)) != -1) {
                row = row2;
            } else {
                row = row3;
            }

            // Check if all characters belong to same row
            boolean valid = true;
            for (char c : lower.toCharArray()) {
                if (row.indexOf(c) == -1) {
                    valid = false;
                    break;
                }
            }

            if (valid) {
                result.add(word);
            }
        }

        return result.toArray(new String[0]);
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        String[] words = {"Hello", "Alaska", "Dad", "Peace"};
        String[] result = sol.findWords(words);
        System.out.println(Arrays.toString(result)); // Output: ["Alaska", "Dad"]
    }
}