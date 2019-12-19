class Solution {
    public int[] findDiagonalOrder(int[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            return new int[0];
        }
        int R = matrix.length, C = matrix[0].length;
        int[] res = new int[R * C];
        int r = 0, c = 0;

        for (int i = 0; i < R * C; i++) {
            res[i] = matrix[r][c];

            if ((r + c) % 2 == 0) {
                // diagonal sliding from bottom left to upper right
                if (r - 1 >= 0 && c + 1 < C) {
                    // Keep the direction from bottom left to upper right
                    r -= 1;
                    c += 1;
                } else if (c + 1 == C) {
                    // hit the right border
                    // go to next row and turn the direction at next round
                    r += 1;
                } else if (r - 1 < 0) {
                    // hit the border at top
                    // go to next column and turn the direction at next round
                    c += 1;
                }
            } else {
                // diagonal sliding from upper right to bottom left
                if (r + 1 < R && c - 1 >= 0) {
                    // Keep the direction from upper right to bottom left
                    r += 1;
                    c -= 1;
                } else if (r + 1 == R) {
                    // hit the border at bottom
                    // go to next column and turn the direction at next round
                    c += 1;
                } else if (c - 1 < 0) {
                    // hit the border at left
                    // go to next row and turn the direction at next round
                    r += 1;
                }
            }
        }
        return res;
    }
}