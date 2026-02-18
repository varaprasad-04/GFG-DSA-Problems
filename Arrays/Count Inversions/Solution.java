class Solution {
    static int merge(int[] arr,int start,int mid,int end){
        int l=start,r=mid+1,count=0;
        int temp[]=new int[end-start+1];
        int k=0;
        while(l<=mid && r<=end){
            if(arr[l]<=arr[r]){
                temp[k++]=arr[l];
                l++;
            }
            else{
                count+=(mid-l+1);
                temp[k++]=arr[r];
                r++;
            }
        }
        while(l<=mid){
            temp[k++]=arr[l++];
        }
        while(r<=end){
            temp[k++]=arr[r++];
        }
        int p=0;
        for(int i=start;i<=end;i++){
            arr[i]=temp[p++];
        }
        return count;
    }
    static int mergesort(int[] arr,int start,int end){
        if (start >= end) return 0;
        int count=0;
        int mid=(start+end)/2;
        count+=mergesort(arr,start,mid);
        count+=mergesort(arr,mid+1,end);
        count+=merge(arr,start,mid,end);
        return count;
    } 
    static int inversionCount(int arr[]) {
        int i=0,j=arr.length-1;
            return mergesort(arr,i,j);
    }
    public static void main(String[] args) {
        int arr[]={1,20,6,4,5};
        System.out.println(inversionCount(arr));
    }
}