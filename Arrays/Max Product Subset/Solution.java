class Solution {
    public int findMaxProduct(int[] arr) {
        if(arr.length==1)return arr[0];
        int p=0,n=0,o=0;
        for(int ele:arr){
            if(ele>0)p++;
            else if(ele<0)n++;
            else o++;
        }
         if (n == 0 && p == 0)
            return 0;
         if (n == 1 && p == 0 && o > 0)
            return 0;

        int nmax=Integer.MIN_VALUE;
        long product = 1;

        for(int ele : arr){
            if(ele != 0){
                product =(product* ele)%1000000007;

                if(ele < 0){
                    nmax = Math.max(nmax, ele);
                }
            }
        }

        if(n % 2 != 0){
            product /= nmax;
        }

        return (int)product;
    
    }
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] arr = {-1, -1, -2, 4, 3};
        System.out.println(s.findMaxProduct(arr));
    }
}