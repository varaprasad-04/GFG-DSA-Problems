import java.util.*;

class Solution {
    static class Robot {
        int pos, health, idx;
        char dir;

        Robot(int p, int h, char d, int i) {
            pos = p;
            health = h;
            dir = d;
            idx = i;
        }
    }

    public List<Integer> survivedRobotsHealths(int[] positions, int[] healths, String directions) {
        int n = positions.length;
        Robot[] robots = new Robot[n];

        for (int i = 0; i < n; i++) {
            robots[i] = new Robot(positions[i], healths[i], directions.charAt(i), i);
        }

        // sort by position
        Arrays.sort(robots, (a, b) -> a.pos - b.pos);

        Stack<Robot> stack = new Stack<>();

        for (Robot curr : robots) {
            if (curr.dir == 'R') {
                stack.push(curr);
            } else {
                // process collisions
                while (!stack.isEmpty() && stack.peek().dir == 'R' && curr.health > 0) {
                    Robot top = stack.peek();

                    if (top.health < curr.health) {
                        stack.pop();
                        curr.health--;
                    } else if (top.health > curr.health) {
                        top.health--;
                        curr.health = 0;
                    } else {
                        stack.pop();
                        curr.health = 0;
                    }
                }

                if (curr.health > 0) {
                    stack.push(curr);
                }
            }
        }

        // collect survivors
        List<Robot> survivors = new ArrayList<>(stack);

        // sort back to original order
        Collections.sort(survivors, (a, b) -> a.idx - b.idx);

        List<Integer> res = new ArrayList<>();
        for (Robot r : survivors) {
            res.add(r.health);
        }

        return res;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] positions = {1, 2, 3, 4};
        int[] healths = {10, 10, 10, 10};
        String directions = "RLRL";
        List<Integer> result = solution.survivedRobotsHealths(positions, healths, directions);
        System.out.println(result); // Output: [9, 9]
    }
}