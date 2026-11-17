class Solution {
    private int r;
    private int c;
    private final int[] row = {-1,1,0,0};
    private final int[] col = {0,0,-1,1};
    private boolean valid(int i,int j){
        return i>=0 && i<r && j>=0 &&j<c;
    }
    static class Pair{
        int first;
        int second;
        Pair(int first,int second){
            this.first = first;
            this.second = second;
        }
    }
    public int numIslands(char[][] grid) {
        r = grid.length;
        c = grid[0].length;
        Queue<Pair> q = new LinkedList<>();
        int island = 0;
        for(int i = 0;i<r;i++){
            for(int j=0;j<c;j++){
                if(grid[i][j]=='1'){
                    island++;
                    q.add(new Pair(i,j));
                    grid[i][j] = '0';
                    while(!q.isEmpty()){
                        Pair front = q.poll();
                        int new_i = front.first;
                        int new_j = front.second;
                        for(int k=0;k<4;k++){
                            int newRow = new_i + row[k];
                            int newCol = new_j + col[k];
                            if(valid(newRow,newCol)&& grid[newRow][newCol]=='1'){
                                q.add(new Pair(newRow,newCol));
                                grid[newRow][newCol] = '0';
                            }

                        }
                    }
                }
            }
        }
        return island;

        
    }
}