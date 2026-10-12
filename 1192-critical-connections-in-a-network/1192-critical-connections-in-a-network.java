class Solution {
    int timer=0;
    public List<List<Integer>> criticalConnections(int n, List<List<Integer>> connections) {
      List<List<Integer>>adj = new ArrayList<>();
      for(int i=0;i<n;i++){
        adj.add(new ArrayList<>());
      }
      for(List<Integer>edge:connections){
        int u=edge.get(0);
        int v=edge.get(1);
        adj.get(u).add(v);
        adj.get(v).add(u);
      }
    int[]disc= new int[n];
    int[]low = new int[n];
    Arrays.fill(disc,-1);
    List<List<Integer>> ans = new ArrayList<>();
    for(int i=0;i<n;i++){
        if(disc[i]==-1){
            dfs(i,-1,adj,disc,low,ans);
        }
    }
    return ans;

    }
    void dfs(int u,int parent,List<List<Integer>> adj,int[]disc,int[]low,List<List<Integer>> ans){
        disc[u]=low[u]=timer++;
        for(int node:adj.get(u)){
            if(node==parent){
                continue;
            }
            if(disc[node]==-1){
                dfs(node,u,adj,disc,low,ans);
                low[u]=Math.min(low[u],low[node]);
                if(low[node]>disc[u]){
                    ans.add(Arrays.asList(u,node));
                }
               
            }
             else{
                    low[u]=Math.min(low[u],disc[node]);
                }
        }

    }
}