/*To solve this problem we will use sliding window approach that for exactly k odd numbers  
we use the apporach that is to find the number of subarrays with at most k odd numbers and subtract the number of subarrays with at most k-1 odd numbers 
TC: O(n)
SC: O(1)
*/



class solution {
    static int noof(int[] arr,int k){
        int odd=0,l=0,r=0,n=arr.length,count=0,sum=0;
        while(r<n){
            if(arr[r]%2!=0)odd++;
            
            while(odd>k){
               if(arr[l]%2!=0) 
                    odd--;
               
                l++;
            }
            count+=r-l+1;
            r++;
        }
        return count;
    }
    public int countSubarrays(int[] arr, int k) {
        // code here
        return noof(arr,k)-noof(arr,k-1);
    }
    public static void main(String args[]){
        solution obj=new solution();
        int arr[]={2,2,2,1,2,2,1,2,2,2};
        int k=2;
        System.out.println(obj.countSubarrays(arr,k));
    }
}
