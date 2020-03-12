class Solution {
    private char[][] board;
    private int ROWS;
    private int COLS;

    public boolean exist(char[][] board, String word) {
        this.board = board;
        ROWS = board.length;
        COLS = board[0].length;

        for (int r = 0; r < ROWS; r++) {
            for (int c = 0; c < COLS; c++) {
                if (backtrack(r, c, 0, word)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean backtrack(int r, int c, int idx, String word) {
        // Step 1: check bottom case
        if (idx == word.length()) {
            return true;
        }

        // Step 2: check boundary or NOT
        if (r < 0 || r >= this.ROWS || c < 0 || c >= this.COLS || this.board[r][c] != word.charAt(idx)) {
            return false;
        }

        // Step 3:
        // Find target for current iteration (mark current position as visited)
        // and move to next iteration(4 directions in this quesiton)
        this.board[r][c] = '#';
        // 4 directions in sequence: left, up, right, down
        int[] rowOffSet = { 0, -1, 0, 1 };
        int[] colOffSet = { -1, 0, 1, 0 };
        for (int i = 0; i < 4; i++) {
            if (backtrack(r + rowOffSet[i], c + colOffSet[i], idx + 1, word)) {
                return true;
            }
        }

        // Step 4: clean the mark in previous step
        this.board[r][c] = word.charAt(idx);
        return false;
    }
}