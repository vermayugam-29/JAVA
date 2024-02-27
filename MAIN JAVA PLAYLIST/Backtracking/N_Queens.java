import java.util.*;

public class N_Queens {
    static List<List<String>> answer = new ArrayList<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 4;//sc.nextInt(); //----> no of queens that we need to place

        boolean[][] board = new boolean[n][n];

        int count = queens(board,0);
        System.out.println(answer);
        System.out.println(count);
    }
    static int queens(boolean[][] board,int row){
        if(row == board.length){
            addElements(board);
            return 1;
        }
        int count = 0;
        //placing the queen and checking for every row and column
        for (int col = 0; col < board.length; col++) {
            //place the queen if  it is safe
            if(isSafe(board,row,col)){
                board[row][col] = true; //marking paths as visited

                //now this is placed now check for another row
                count += queens(board,row+1);

                board[row][col] = false; //marking visited paths as not visited while backtracking
            }
        }
        return count;
    }

//Safe function which checks if it is safe to place queen at that (i,j) index
    static boolean isSafe(boolean[][] board, int row, int col) {
        //check for vertical that is UP positions of board
        //row--,col(same)
        for (int i=row; i >=0; i--) {
            if(board[i][col]) return false; //if true that means that it is visited and hence we can't
                                            //place our queen here
        }

        //check for left diagonal
        //row--,col--
        int maxLeft = Math.min(row,col);//max time we can go left
        for (int i = 1; i <= maxLeft; i++) { //subtracting by 1
            if(board[row-i][col-i]) return false;
        }

        //check for right diagonal
        //row--,col++(because we are doing col++ we  need to find min b/w (len-col-1),row)
        int maxRight = Math.min(row, (board.length-1)-col);//max time we can go right
        for (int i = 1; i <= maxRight; i++) { //subtracting by 1
            if(board[row-i][col+i]) return false;
        }

        return true;
    }


    //adding in arraylist-------------------------------------------------------------------------------------
    static void addElements(boolean[][] board) {
        List<String> list = new ArrayList<>();
        //for every row in my board
//        for(boolean[] row : board){
//            //for every element in my row array
//            String s = "";
//            for(boolean e: row){
//                //if true then that means queen can be placed at that (i,j) index
//                if(e) s+= "Q";
//                else s+=".";
//            }
//            list.add(s);
//        }
        //or do like this-----------------------------------------------------
        for (int i = 0; i < board.length; i++) {
            String s = "";
            for (int j = 0; j < board.length; j++) {
                if(board[i][j]) s += "Q";
                else s+= ".";
            }
            list.add(s);
        }
        answer.add(list);
    }
}
