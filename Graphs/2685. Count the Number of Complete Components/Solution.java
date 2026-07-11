class Solution {
    void dfs(int s,boolean v[],int g[][],ArrayList<Integer> c){
        v[s]=true;
        c.add(s);
        for(int i=0;i<v.length;i++){
            if(g[s][i]==1 && !v[i])
                dfs(i,v,g,c);
        }
    }
    int count_components(int n,int edges[][]){
        int c=0;
        boolean v[]=new boolean[n];
        int g[][]=new int[n][n];
        for(int i=0;i<edges.length;i++){
            int u=edges[i][0];
            int vi=edges[i][1];
            g[u][vi]=1;
            g[vi][u]=1;
        }
        for(int i=0;i<n;i++){
            if(!v[i]){
                ArrayList<Integer> component = new ArrayList<>();

                dfs(i, v, g, component);

                boolean complete = true;

                for(int x = 0; x < component.size(); x++) {
                    for(int y = x + 1; y < component.size(); y++) {
                        int u = component.get(x);
                        int vi = component.get(y);

                        if(g[u][vi] == 0) {
                            complete = false;
                            break;
                        }
                    }
                }

                if(complete) {
                    c++;
                }
            }
        }
        return c;
    }
    public int countCompleteComponents(int n, int[][] edges) {
        int c=count_components(n,edges);

        return c;
    }
}