class Solution {
    public int[] resultArray(int[] nums) {
        int n=nums.length,op=0;
        ArrayList<Integer>s1=new ArrayList<>();
        ArrayList<Integer>s2=new ArrayList<>();
        s1.add(nums[0]);
        s2.add(nums[1]);
        for(int i=2;i<n;i++){
           if(s1.get(s1.size()-1)>s2.get(s2.size()-1))s1.add(nums[i]);
            else s2.add(nums[i]);
        }
        int res[]=new int[n];
        int k=0;
        for(int ele:s1){
            res[k++]=ele;
        }
        for(int ele:s2){
            res[k++]=ele;
        }
        return res;
    }
}