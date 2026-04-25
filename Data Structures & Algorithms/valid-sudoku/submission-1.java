class Solution {
    public boolean isSafe(char[][] board, int row, int col, char digit){
        for(int j = 0; j<9; j++){
            if(board[row][j] == digit){
                return false;
            }
        }

        for(int i = 0; i<9; i++){
            if(board[i][col] == digit){
                return false;
            }
        }

        int r = (row/3)*3;
        int c = (col/3)*3;

        for(int i = r; i<=r+2; i++){
            for(int j = c; j<=c+2; j++){
                if(board[i][j] == digit){
                    return false;
                }
            }
        }
        return true;
    }

    public boolean check(char[][] board, int row, int col){
        if(row == 9){
            return true;
        }
        int nextRow = row;
        int nextCol = col+1;
        if(nextCol == 9){
            nextRow = row+1;
            nextCol = 0;
        }

        if(board[row][col] == '.'){
            return check(board, nextRow, nextCol);
        }

        char ch = board[row][col];
        board[row][col] = '.';
        if(isSafe(board, row,col,ch)){
            board[row][col] = ch;
            if(check(board, nextRow, nextCol)){
                return true;
            }
        }
        return false;
    }
    public boolean isValidSudoku(char[][] board) {
        return check(board, 0, 0);
    }
}
