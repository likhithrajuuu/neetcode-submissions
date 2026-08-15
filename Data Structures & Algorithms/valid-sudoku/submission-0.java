class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> seen = new HashSet<>();

        for (int r = 0; r < 9; r++) {
            for (int c = 0; c < 9; c++) {
                char num = board[r][c];

                if (num == '.') continue;

                if (!seen.add(num + "r" + r) ||
                    !seen.add(num + "c" + c) ||
                    !seen.add(num + "b" + (r / 3) + (c / 3))) {
                    return false;
                }
            }
        }

        return true;
    }
}
