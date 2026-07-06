class Solution {
    public int maxPathSum(int[] a, int[] b) {
        int i=0,j=0;
        int sum1=0,sum2=0,ans=0;
        while(i<a.length && j<b.length){
            if(a[i]<b[j]){
                sum1+=a[i++];   
            }
            else if(b[j]<a[i]){
                sum2+=b[j++];
            }
            else{
                ans+=Math.max(sum1,sum2);
                ans+=a[i];
                sum1=0;sum2=0;
                i++;
                j++;
            }
        }
        //if(i==a.length-1 && j== b.length-1)return Math.max(sum1,sum2);
        //int c1=0,c2=0;
        while(i<a.length){
            sum1+=a[i];
            i++;
        }
        while(j<b.length){
            sum2+=b[j];
            j++;
        }
         ans+=Math.max(sum1,sum2);
        
        return ans;
    }
    public static void main(String[] args) {
        Solution s=new Solution();
        int[] a={2,4,5,8,10};
        int[] b={4,6,8,9};
        System.out.println(s.maxPathSum(a,b));
    }   
}