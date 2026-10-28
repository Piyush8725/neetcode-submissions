class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.') {
                int n = board[i][j] - '0';
                if (!set.add(n)) {
                    return false;
                }
            }
            }
            set.clear();
        }
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[j][i] != '.') {
                int n = board[j][i] - '0';
                if (!set.add(n)) {
                    return false;
                }
            }
            }
            set.clear();
        }
        int i = 0;
        int l = 2;
        for (int j = 0; j <= l; j++) {
            if (board[i][j] != '.') {
                int n = board[i][j] - '0';
                if (!set.add(n)) {
                    return false;
                }
            }
            if (board[i + 1][j] != '.') {
                int n = board[i+1][j] - '0';
                if (!set.add(n)) {
                    return false;
                }
            }
            if (board[i + 2][j] != '.') {
                int n = board[i+2][j] - '0';
                if (!set.add(n)) {
                    return false;
                }
            }
            System.out.println(set);

            if (i == 6 && j == 8)
                break;
            if (j == l) {
                set.clear();
                l = l + 3;
                if (j == 8) {
                    j = -1;
                    l = 2;
                    i = i + 3;
                }
            }
        }
        return true;
    }
}
