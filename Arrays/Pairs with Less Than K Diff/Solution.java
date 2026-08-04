import java.util.Arrays;
class Solution {
    public static int countPairs(int arr[], int k) {
        Arrays.sort(arr);
       int r=0,c=0;
        for(int i=0;i<arr.length;i++){
            while(r<arr.length && arr[r]-arr[i]<k){
                r++;
            }
            
            c+=(r-i-1);
        }
        return c;
        
    }
    public static void main(String[] args) {
        int arr[]={1,5,3,4,2};
        int k=3;
        System.out.println(countPairs(arr,k));
    }
}
