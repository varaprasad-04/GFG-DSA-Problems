class Solution {
    public int countIncreasing(int[] arr) {
        int c=1,res=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>arr[i-1]){
                c++;
            }
            else{
                res+=(c*(c-1))/2;
                c=1;
            }
        }
        res+=(c*(c-1))/2;
        
        return res;
        
    }
    public static void main(String[] args) {
        Solution s=new Solution();
        int[] arr={1,2,3,4};
        System.out.println(s.countIncreasing(arr));
    }
}
