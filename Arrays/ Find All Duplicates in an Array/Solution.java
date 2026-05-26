import java.util.*; 
class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> s2=new ArrayList<>();
       for(int i=0;i<nums.length;i++){
            int ind=Math.abs(nums[i])-1;
            if(nums[ind]<0)s2.add(Math.abs(nums[i]));
            else nums[ind]=-nums[ind];
       }
        
        return s2;
    }
    public static void main(String[] args) {
        Solution s=new Solution();
        int[] nums={4,3,2,7,8,2,3,1};
        List<Integer> duplicates = s.findDuplicates(nums);
        System.out.println(duplicates);
    }
}