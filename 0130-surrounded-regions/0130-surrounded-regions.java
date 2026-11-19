class Solution {
    class Pair{
        int first;
        int second;
        Pair(int first, int second){
            this.first = first;
            this.second = second;
        }
    }
    int r;
    int c;
    private final int[] row = {-1,1,0,0};
    private final int[] col = {0,0,-1,1};
    private boolean valid(int i,int j){
        return i>=0 && i<r && j>=0 && j<c;
    }
    public void solve(char[][] board) {
        Queue<Pair> q = new LinkedList<>();
        r = board.length;
        c = board[0].length;
        for(int i=0;i<c;i++){
            if(board[0][i]=='O'){
                q.add(new Pair(0,i));
                board[0][i] = 'T';

            }
        }
        for(int i=1;i<r;i++){
            if(board[i][0]=='O'){
                q.add(new Pair(i,0));
                board[i][0] = 'T';
            }
        }
        for(int i=1;i<c;i++){
            if(board[r-1][i]=='O'){
                q.add(new Pair(r-1,i));
                board[r-1][i] = 'T';
            }
        }
        for(int i = 1;i<r-1;i++){
            if(board[i][c-1]=='O'){
                q.add(new Pair(i,c-1));
                board[i][c-1]='T';
            }
        }
        while(!q.isEmpty()){
            Pair curr = q.poll();
            for(int k=0;k<4;k++){
                int nr = curr.first + row[k];
                int nc = curr.second + col[k];
                if(valid(nr,nc) && board[nr][nc]=='O'){
                    q.add(new Pair(nr,nc));
                    board[nr][nc] = 'T';

                }


            }
        }

        for(int i =0;i<r;i++){
            for(int j =0;j<c;j++){
                if(board[i][j] == 'T'){
                    board[i][j] = 'O';
                }
                else if(board[i][j] == 'O'){
                    board[i][j] = 'X';
                }
            }
        }
        
    }
}