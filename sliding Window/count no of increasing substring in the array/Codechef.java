import java.util.*;

class Codechef
{
    static long count(int arr[],int n){
        if(n==1)return 1;
        long c=1,ans=0;
        for(int i=1;i<n;i++){
            if(arr[i]>=arr[i-1]){
                c++;
            }
            else{
                ans+=c*(c+1)/2;
                c=1;
            }
        }
        ans+=c*(c+1)/2;
        
        return ans;
    }
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc=new Scanner(System.in);
	    int t=sc.nextInt();
	    while(t --> 0){
	        int n=sc.nextInt();
	        int arr[]=new int[n];
	        for(int i=0;i<n;i++){
	            arr[i]=sc.nextInt();
	        }
	        long c=count(arr,n);
	        System.out.println(c);
	    }
	}
}
