import java.util.Scanner;

public class MazePathWays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int row = sc.nextInt();
        int col = sc.nextInt();
        path("",row-1,col-1);
        path2("",row-1,col-1);
    }
    //code when we can only go right and down--------------------------------------------------------
    static void path(String p,int row,int col){
        if(row ==0 && col==0){
            System.out.println(p);
            return;
        }

        //first go Horizontal or right
        if(col > 0) path(p+"R",row,col-1);
        //then go Vertical or down
        if(row > 0) path(p+"D",row-1,col);
    }
    //code when we can go right (Horizontal) , down (Vertical) and diagonally(Represented by D)-----------
    static void path2(String p,int row,int col){
        if(row == 0 && col == 0){
            System.out.println(p);
            return;
        }

        //first go Vertical or down
        if(row > 0) path2(p+"V",row-1,col);
        //then go Horizontal or right
        if(col > 0) path2(p+"H",row,col-1);
        //now go diagonally
        if(row > 0 && col > 0) path2(p+"D",row-1,col-1);
    }
}
