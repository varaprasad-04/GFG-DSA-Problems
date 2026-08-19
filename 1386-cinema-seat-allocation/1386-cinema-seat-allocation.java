class Solution {
    public int maxNumberOfFamilies(int n, int[][] reservedSeats) {
        int ans=0,m1=reservedSeats.length;
        HashMap<Integer,ArrayList<Integer>>s1=new HashMap<>();
        for(int i=0;i<m1;i++){
            int a=reservedSeats[i][0];
            int b=reservedSeats[i][1];
            if(!s1.containsKey(a)){
                ArrayList<Integer>s2=new ArrayList<>();
                s2.add(b);
                s1.put(a,s2);
            }
            else{
                s1.get(a).add(b);
            }
        }
        ans += (n - s1.size()) * 2;
        for(Map.Entry<Integer,ArrayList<Integer>>e:s1.entrySet()){
            int k=e.getKey();
            ArrayList<Integer>s2=e.getValue();
            boolean l=true,m=true,r=true;
            for(int ele:s2){
                if(ele==2 || ele==3 || ele==4 || ele==5)l=false;
                if(ele==4 || ele==5 || ele==6 || ele==7)m=false;
               if(ele==6 || ele==7 || ele==8 || ele==9)r=false;
            }
            if(l&&r)ans+=2;
            else if(l || m || r)ans+=1;
        }
        return ans;
    }
}