class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        int i=0,j=0,n=nums.length,c=0;
        HashMap<Integer,Integer>s1=new HashMap<>();
        while(j<n){
            s1.put(nums[j],s1.getOrDefault(nums[j],0)+1);
            if(s1.get(nums[j])<=k)
                c=Math.max(j-i+1,c);
            else{
                while(s1.get(nums[j])>k){
                    s1.put(nums[i],s1.get(nums[i])-1);
                    if(s1.get(nums[i])==0)
                        s1.remove(nums[i]);
                    i++;
                }
            }
            j++;
        }
        return c;
    }
}