class Solution {
    int maxOnes(int[] arr) {
        int or=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==1){
                arr[i]=-1;
                or++;
            }
            else arr[i]=1;
        }
        int max=0,cur=0;
        for(int i=0;i<arr.length;i++){
            cur=Math.max(arr[i],cur+arr[i]);
            max=Math.max(max,cur);
        }
        return max+or;
    }
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] arr = {1, 0, 0, 1, 0};
        System.out.println(s.maxOnes(arr)); // Output: 4
    }
};