import java.util.Arrays;
class Solution {
    int lis(int arr[]){
        int n=arr.length;
        int li[]=new int[n];
        li[0]=arr[0];
        int c=1;
        for(int i=1;i<n;i++){
            if(arr[i]>li[c-1]){
                li[c]=arr[i];
                  c++;
            }
            else{
                int l=Arrays.binarySearch(li,0,c,arr[i]);
                if(l<0)
                    l=-(l+1);
                    
                li[l]=arr[i];
            }
        }
        return c;
    }
    public int minDeletions(int[] arr) {
        int c=lis(arr);
        int n=arr.length;
        return n-c;
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] arr = {3, 1, 2, 1, 4};
        System.out.println(sol.minDeletions(arr)); // Output: 2
    }   
}