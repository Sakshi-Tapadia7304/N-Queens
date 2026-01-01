public class NQueens {
    private int N;

    public NQueens(int N) {
        this.N = N;
    }

    // Function to print the board
    private void printBoard(int[][] board) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (board[i][j] == 1)
                    System.out.print("Q ");
                else
                    System.out.print(". ");
            }
            System.out.println();
        }
        System.out.println();
    }

    // Check if placing queen is safe
    private boolean isSafe(int[][] board, int row, int col) {
        // Check column
        for (int i = 0; i < row; i++) {
            if (board[i][col] == 1)
                return false;
        }

        // Check upper-left diagonal
        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 1)
                return false;
        }

        // Check upper-right diagonal
        for (int i = row, j = col; i >= 0 && j < N; i--, j++) {
            if (board[i][j] == 1)
                return false;
        }

        return true;
    }

    // Recursive function to solve N-Queens
    private void solveNQueens(int[][] board, int row) {
        if (row == N) {
            printBoard(board);
            return;
        }

        for (int col = 0; col < N; col++) {
            if (isSafe(board, row, col)) {
                board[row][col] = 1; // Place queen
                solveNQueens(board, row + 1); // Recurse
                board[row][col] = 0; // Backtrack
            }
        }
    }

    public void solve() {
        int[][] board = new int[N][N];
        solveNQueens(board, 0);
    }

    public static void main(String[] args) {
        int N = 4; // Change this value for different board sizes
        NQueens queens = new NQueens(N);
        queens.solve();
    }
}
