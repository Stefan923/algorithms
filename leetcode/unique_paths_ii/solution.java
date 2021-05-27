class Solution {
    
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        int[][] grid = new int[m][n];
        grid[0][0] = obstacleGrid[0][0] == 0 ? 1 : 0;
        
        for (int i = 0; i < m; ++i) {
            for (int j = 0; j < n; ++j) {
                if (obstacleGrid[i][j] == 0) {
                    if (i > 0) {
                        grid[i][j] += grid[i - 1][j];
                    }
                    if (j > 0) {
                        grid[i][j] += grid[i][j - 1];
                    }
                }
            }
        }
        
        return grid[m - 1][n - 1];
    }
    
}
