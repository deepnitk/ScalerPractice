import java.util.*;

public class Solution {
	public void solveSudoku(char[][] board) {
        if(board == null || board.length ==0)
            return;
        solve(board);
	}

    boolean solve(char[][] board){
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board[0].length; j++){
                if(board[i][j]== '.'){
                    // trying all possibilities 1 through 9
                    for(char c = '1'; c<= '9'; c++){
                        if(isValid(board, i, j, c)){
                            //put c for this cell
                            board[i][j] = c;
                            if(solve(board))
                                return true; //return true if it is the solution
                            else
                                board[i][j]= '.'; // else backtrack
                        }
                    }
                    return false; // we are not able to put any possibilities 1 through 9
                }
            }
        }
        return true;
    }

    boolean isValid(char[][] board, int row, int col, char c){
        for(int i=0;i<9;i++){
            //check row
            if(board[row][i]== c && board[row][i] != '.') return false;
            //check col
            if(board[i][col]== c && board[i][col] !='.') return false;
            //check 3*3 block
            if(board[3 * (row / 3) + i / 3][3 * (col / 3) + i % 3] == c &&
                board[3 * (row / 3) + i / 3][3 * (col / 3) + i % 3] != '.') return false;
        }
        return true;
    }
}
