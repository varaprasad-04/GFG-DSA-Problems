import java.util.HashMap;
class Solution {
    int reverse(int n){
        int ans=0;
        while(n!=0){
            int r=n%10;
            ans=(ans*10)+r;
            n/=10;
        }
        return ans;
    }
    public int minMirrorPairDistance(int[] nums) {
        HashMap<Integer,Integer>s1=new HashMap<>();
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            
           
            if(s1.containsKey(nums[i]) ){
                int v=Math.abs(i-s1.get(nums[i]));
                ans=Math.min(v,ans);
            }
             int n=reverse(nums[i]);
            s1.put(n,i);
        }
        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = {12, 21, 13, 31, 14};
        System.out.println(s.minMirrorPairDistance(nums)); // Output: 2
    }
}