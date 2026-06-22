import java.util.List;
class Solution {
    public int maxArea(List<Integer> height) {
        int min=-1;
        int lmax=0,rmax=height.size()-1;
        while(lmax<rmax){
            if(height.get(lmax)<height.get(rmax)){
                min=Math.max(min,height.get(lmax)*(rmax-lmax-1));
                lmax++;
            }
            else{
                min=Math.max(min,height.get(rmax)*(rmax-lmax-1));
                rmax--;
            }
        }
        return min;
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        List<Integer> height = List.of(1, 8, 6, 2, 5, 4, 8, 3, 7);
        int result = sol.maxArea(height);
        System.out.println(result); // Output: 49
    }
}