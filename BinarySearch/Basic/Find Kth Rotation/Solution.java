class Solution {
    public int findKRotation(int arr[]) {
       int min=Integer.MAX_VALUE;
       int l=0,h=arr.length-1,index=-1;
       while(l<=h){
           if(arr[l]<arr[h]){
              return l;
          }
           int mid=(l+h)/2;
          if(mid>0 && arr[mid]<arr[mid-1])return mid;
           else if(arr[mid]<arr[h]){
              
              h=mid-1;
           }
           else {
              
               l=mid+1;
           }
           
       }
       return 0;
    }
    public static void main(String[] args) {
        Solution s=new Solution();
        int arr[]={15, 18, 2, 3, 6, 12};
        System.out.println(s.findKRotation(arr));
    }
}