import java.util.ArrayDeque;
import java.util.Queue;

class Solution {
    public int countIslands(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;
        int count = 0;
        
        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                // If we find an unvisited land cell
                if (grid[i][j] > 0) {
                    long totalValue = 0;
                    Queue<int[]> queue = new ArrayDeque<>();
                    
                    queue.offer(new int[]{i, j});
                    totalValue += grid[i][j];
                    grid[i][j] = 0; // Mark as visited by resetting to 0
                    
                    while (!queue.isEmpty()) {
                        int[] curr = queue.poll();
                        int r = curr[0];
                        int c = curr[1];
                        
                        for (int d = 0; d < 4; d++) {
                            int nr = r + dr[d];
                            int nc = c + dc[d];
                            
                            if (nr >= 0 && nr < m && nc >= 0 && nc < n && grid[nr][nc] > 0) {
                                totalValue += grid[nr][nc];
                                grid[nr][nc] = 0; // Mark as visited
                                queue.offer(new int[]{nr, nc});
                            }
                        }
                    }
                    
                    // Check if the total island value is divisible by k
                    if (totalValue % k == 0) {
                        count++;
                    }
                }
            }
        }
        
        return count;
    }
}