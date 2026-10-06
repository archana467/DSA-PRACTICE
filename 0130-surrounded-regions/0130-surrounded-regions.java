class Solution {
    public void solve(char[][] board) {
     int rows=board.length;
     int cols=board[0].length;
     Queue<int[]> q=new LinkedList<>();
     //counting all boundary O's 
     for(int i=0;i<cols;i++){
        if(board[0][i]=='O') {
        board[0][i]='*';
            q.add(new int[]{0,i});
        }
        if(board[rows-1][i]=='O'){ 
        board[rows-1][i]='*';
            q.add(new int[]{rows-1,i});
        }

     } 
     for(int j=0;j<rows;j++){
          if(board[j][0]=='O') {
        board[j][0]='*';
            q.add(new int[]{j,0});
        }
        if(board[j][cols-1]=='O'){ 
        board[j][cols-1]='*';
            q.add(new int[]{j,cols-1});
        }
     }  
     int [][]directions={
        {-1,0},
        {0,-1},
        {0,1},
        {1,0}
     };
     while(!q.isEmpty()){
        int []curr=q.poll();
        int r=curr[0];
        int c=curr[1];
        for(int[]dir:directions){
            int nr=r+dir[0];
            int nc=c+dir[1];
            if(nr>=0 && nr<rows && nc>=0 && nc<cols && board[nr][nc]=='O'){
                board[nr][nc]='*';
                q.add(new int[]{nr,nc});
            }
        }
     }
     for(int i=0;i<rows;i++){
        for(int j=0;j<cols;j++){
            if(board[i][j]=='O'){
                board[i][j]='X';
            }
            if(board[i][j]=='*'){
                board[i][j]='O';
            }
        }
     }
    }
}