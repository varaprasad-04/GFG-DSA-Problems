class Solution {
    public boolean canSeatAllPeople(int k, int[] seats) {
        //if(k==0)return true;
        int n=seats.length;
        if(n==1 && k==1){
            if(seats[0]==0)return true;
            else return false;
        }
        if(n==1 && k<=0)return true;
        
        if(seats[n-2]==0 && seats[n-1]==0){
            k--;
            seats[n-1]=1;
        }
        for(int i=0;i<seats.length-1;i++){
            if(seats[i]!=1){
               if((i==0 && i+1<n) && (seats[i]==0 && seats[i+1]==0)){
                    seats[i]=1;
                    k--;
                }
             else{
                if(i-1 >=0 && i+1<n){
                    if(seats[i-1] ==0 && seats[i+1]==0){
                        seats[i]=1;
                        k--;
                    }
                }
            }
            
            }
            else continue;
            
        }
        if(k>0)return false;
        for(int i=1;i<n;i++){
            if(seats[i]==1 && seats[i-1]==1)return false;
        }
        
        
        return true;
    }
}