class Solution {
    public int numIslands(char[][] grid) {
        int islandCnt = 0;
        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid[0].length; c++) {
                if (grid[r][c] == '1') {
                    dfsTraverse(grid, r, c);
                    islandCnt++;
                }
            }
        }
        return islandCnt;
    }

    public void dfsTraverse(char[][] grid, int r, int c) {
        if (r < 0 || r >= grid.length || c < 0 || c >= grid[0].length || grid[r][c] != '1') {
            return;
        }
        grid[r][c] = '0';
        dfsTraverse(grid, r - 1, c);
        dfsTraverse(grid, r + 1, c);
        dfsTraverse(grid, r, c - 1);
        dfsTraverse(grid, r, c + 1);
    }
}