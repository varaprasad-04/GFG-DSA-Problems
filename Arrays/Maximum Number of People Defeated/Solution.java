class Solution {
    int maxPeopleDefeated(int p) {
        int c=0;
        for(int i=1;i<=Math.sqrt(p);i++){
            if(i*i<=p)c++;
            p-=i*i;
        }
        return c;
    }
    public static void main(String[] args) {
        Solution s=new Solution();
        System.out.println(s.maxPeopleDefeated(10));
    }   
};