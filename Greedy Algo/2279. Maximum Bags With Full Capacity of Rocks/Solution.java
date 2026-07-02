class Solution {
    public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
        int need[]=new int[rocks.length];
        for(int i=0;i<rocks.length;i++){
            need[i]=capacity[i]-rocks[i];
        }
        Arrays.sort(need);
        int c=0;
        for(int i=0;i<rocks.length;i++){
            if(need[i]==0)c++;
            else if(need[i]<=additionalRocks ){
                    additionalRocks-=need[i];
                    c++;
            }
            
            }
      
        return c;
    }
}