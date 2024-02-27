public class SudokuSolver {
    static boolean solve(char[][] board){
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j] == '.'){
                    for(char c='1'; c<='9'; c++){
                        if(canPlace(board,c,i,j)){
                            board[i][j] = c;
                            if(solve(board)){
                                return true;
                            }else {
                                board[i][j] = '.'; //revert changes if not possible
                            }
                        }
                    }
                    //if not possible after iterating whole char array
                    return false;
                }
            }
        }
        return true;
    }
    static boolean canPlace(char[][] board,char ch,int currRow,int currCol){
        for(int i=0;i<9;i++){
            if(board[i][currCol] == ch) return false;
        }
        for(int i=0;i<9;i++){
            if(board[currRow][i] == ch) return false;
        }

        int maxRow = (currRow/3)*3;
        int maxCol = (currCol/3)*3;

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(board[maxRow + i][maxCol + j] == ch) return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        char[][] board = {  {'9', '5', '7', '.', '1', '3', '.', '8', '4'},
                            {'4', '8', '3', '.', '5', '7', '1', '.', '6'},
                            {'.', '1', '2', '.', '4', '9', '5', '3', '7'},
                            {'1', '7', '.', '3', '.', '4', '9', '.', '2'},
                            {'5', '.', '4', '9', '7', '.', '3', '6', '.'},
                            {'3', '.', '9', '5', '.', '8', '7', '.', '1'},
                            {'8', '4', '5', '7', '9', '.', '6', '1', '3'},
                            {'.', '9', '1', '.', '3', '6', '.', '7', '5'},
                            {'7', '.', '6', '1', '8', '5', '4', '.', '9'}
        };

        solve(board);

        for(char[] arr : board){
            for(char ch : arr){
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
}
