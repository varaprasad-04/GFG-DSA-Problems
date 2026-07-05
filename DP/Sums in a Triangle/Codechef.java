import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t --> 0){
		    int n=sc.nextInt();
		    int arr[][]=new int[n][n];
		    for(int i=0;i<n;i++){
		        for(int j=0;j<=i;j++){
		            arr[i][j]=sc.nextInt();
		        }
		    }
		    int dp[][]=new int[n][n];
		    for(int i=0;i<n;i++){
		        dp[n-1][i]=arr[n-1][i];
		    }
		    for(int i=n-2;i>=0;i--){
		        for(int j=0;j<=i;j++){
		            dp[i][j]=arr[i][j]+Math.max(dp[i+1][j+1],dp[i+1][j]);
		        }
		    }
		    System.out.println(dp[0][0]);
		}

	}
}
