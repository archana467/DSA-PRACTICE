class Solution {
    public int[][] updateMatrix(int[][] mat) {
    int rows=mat.length;
    int cols=mat[0].length;
    int[][]ans = new int[rows][cols];
    Queue<int[]> q= new LinkedList<>();
    for(int i=0;i<rows;i++){
        for(int j=0;j<cols;j++){
         if(mat[i][j]==0){
            ans[i][j]=0;
            q.add(new int[]{i,j});
         }
         if(mat[i][j]==1){
            ans[i][j]=-1;
         }
        }
    }  
    int[][] directions = {
        {-1,0},
        {0,-1},
        {0,1},
        {1,0}
    };
    while(!q.isEmpty()){
        int[]curr=q.poll();
        int r=curr[0];
        int c=curr[1];
        for(int[]dir:directions){
            int nr=r+dir[0];
            int nc=c+dir[1];
            if(nr>=0 && nr<rows &&
            nc>=0 && nc<cols &&
            ans[nr][nc]==-1){
                ans[nr][nc]=ans[r][c] +1;
                q.add(new int[]{nr,nc});
            }
        }
    }
    return ans;
    }
}