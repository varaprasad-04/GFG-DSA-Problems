class Solution {
    public int largestInteger(int[] nums, int k) {
        HashMap<Integer,Integer>s1=new HashMap<>();
        for(int e:nums){
            s1.put(e,s1.getOrDefault(e,0)+1);
        }
        int n=nums.length;
        if(k==n){
            int max=nums[0];
            for(int e:nums){
                max=Math.max(max,e);
            }
            return max;
        }
        if(k==1){
            int ans=-1;
            for(int e:nums){
                if(s1.get(e)==1)ans=Math.max(ans,e);
            }
            return ans;
        }
        int f=s1.get(nums[0]);
        int l=s1.get(nums[n-1]);
        if(f>1 && l>1)return -1;
        if(f==l)return Math.max(nums[0],nums[n-1]);
        return (f>l)?nums[n-1]:nums[0];
    }
}