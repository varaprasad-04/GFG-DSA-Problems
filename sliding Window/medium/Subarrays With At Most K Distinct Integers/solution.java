import java.util.*;
class solution {
    public int countAtMostK(int arr[], int k) {
        
       int count=0;
       int r=0,l=0,n=arr.length;
       HashMap<Integer,Integer>s1=new HashMap<>();
       while(r<n){
           s1.put(arr[r],s1.getOrDefault(arr[r],0)+1);
           while(s1.size()>k){
              s1.put(arr[l],s1.get(arr[l])-1);
              if(s1.get(arr[l])==0)s1.remove(arr[l]);
              l++;
           }
           count+=r-l+1;
           r++;
       }
       return count;
    }
    public static void main(String args[]){
        solution s=new solution();
        int arr[]={1,2,1,2,3};
        int k=2;
        int result=s.countAtMostK(arr,k);
        System.out.println(result);
    }
}
