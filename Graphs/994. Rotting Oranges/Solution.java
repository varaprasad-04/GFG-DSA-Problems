class Solution {
    public int orangesRotting(int[][] grid) {
        Queue<int[]> s1=new LinkedList<>();
        int n=grid.length;
        int m=grid[0].length,fresh=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
               if(grid[i][j]==2)
                    s1.offer(new int[]{i,j});
                if(grid[i][j]==1)fresh++;
            }
        }
        if(fresh==0)return 0;
        int dx[]={-1,1,0,0};
        int dy[]={0,0,-1,1};
        int tot=0;
        while(!s1.isEmpty()){
            int n1=s1.size();
            for(int i=0;i<n1;i++){
                int p[]=s1.poll();
                for(int j=0;j<4;j++){
                    int x=p[0]+dx[j];
                    int y=p[1]+dy[j];
                    if(x<0 || y<0 || x>= n|| y>=m || grid[x][y]==0|| grid[x][y]==2) continue;

                    grid[x][y]=2;
                    fresh--;
                    s1.offer(new int[]{x,y});
                }
            }
            if(s1.size()!=0)tot++;
        }
        return (fresh==0)?tot:-1;
    }
}