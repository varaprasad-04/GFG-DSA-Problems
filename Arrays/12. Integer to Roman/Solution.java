class Solution {
    public String intToRoman(int num) {
        int arr[]={1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String rom[]={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        int j=0;
        StringBuilder s1=new StringBuilder();
        while(num!=0){
            if(num>=arr[j]){
               while(num>=arr[j]) {
                    s1.append(rom[j]);
                    num-=arr[j];
               }
                j++;
            }
            else j++;
            
        }
        return s1.toString();

    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        int num = 1994;
        System.out.println(sol.intToRoman(num)); // Output: "MCMXCIV"
    }
}