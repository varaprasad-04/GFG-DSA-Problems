class Solution {
    void segregate0and1(int[] arr) {
        int l=0,n=0;
        for(l=0;l<arr.length;l++){
            if(arr[l]==1)break;
        }
        
        n=l;
        while(l<arr.length){
            if(arr[l]==0){
                arr[l]=1;
                arr[n]=0;
                n++;
            }
            l++;
        }
    }
    public static  void main(String[] args) {
        Solution solution = new Solution();
        int[] arr = {0, 1, 0, 1, 0, 1};
        solution.segregate0and1(arr);
        System.out.print("Segregated array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
