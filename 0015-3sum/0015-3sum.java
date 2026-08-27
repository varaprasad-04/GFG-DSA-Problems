class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
         Set<List<Integer>> s1=new HashSet<>();
        Arrays.sort(nums);
         int n=nums.length;
         for(int i=0;i<n-2;i++){
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            HashSet<Integer> s2=new HashSet<>();
          for(int j=i+1;j<n;j++){
                int sum=-nums[i]-nums[j];
                if(s2.contains(sum)){
                    ArrayList<Integer> s3=new ArrayList<>();
                    s3.add(nums[i]);
                    s3.add(nums[j]);
                    s3.add(sum);
                    Collections.sort(s3);
                    s1.add(s3);
                   
                }
                s2.add(nums[j]);
            }
            
         }   
         return new ArrayList<>(s1);
    }
}