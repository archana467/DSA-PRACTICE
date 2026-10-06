class Solution {
    public int orangesRotting(int[][] grid) {
    Queue<int[]> q = new LinkedList<>();
    int rows=grid.length;
    int cols=grid[0].length;
    int fresh=0;
    for(int i=0;i<rows;i++){
        for(int j=0;j<cols;j++){
            if(grid[i][j]==2){
                q.add(new int[]{i,j});
            }
            if(grid[i][j]==1){
                fresh++;
            }
        }
    }  
    int[][]directions={
        {-1,0},
        {0,-1},
        {1,0},
        {0,1},
    };
    int minutes=0;
    while(!q.isEmpty() && fresh>0){
        int s=q.size();
        for(int i=0;i<s;i++){
        int[] curr=q.remove();
        int r=curr[0];
        int c=curr[1];
        for(int[] dir:directions){
            int nr=r + dir[0];
            int nc=c+ dir[1];
        if(nr>=0 && nr<rows && nc>=0 && nc<cols &&
        grid[nr][nc]==1){
            grid[nr][nc]=2;
            fresh--;
            q.add(new int[]{nr,nc});
          
        }

        }
        }
        minutes++;
       
    }
    if(fresh==0){
        return minutes;
    }
    return -1;
    }
}
