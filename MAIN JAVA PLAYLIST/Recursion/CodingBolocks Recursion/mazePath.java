//Ques Statemet:-
//Take as input N1 and N2, both numbers. N1 and N2 is the number of rows and columns on a rectangular
// board. Our player starts in top-left corner of the board and must reach bottom-right corner. In one move the
// player can move 1 step horizontally (right) or 1 step vertically (down) or 1 step diagonally (south-east).
//
//Write a recursive function which:
//a. Returns the count of different ways the player can travel across the board. Print the value returned.
//b. Prints moves for all valid paths across the board

import java.util.Scanner;

public class mazePath {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 1;//sc.nextInt(); //rows
        int m = 1;//sc.nextInt(); //columns

        path("",n-1,m-1);
        System.out.println();
        System.out.println(count);
    }
    static int count = 0;
    static void path(String p,int v,int h){
        if(v==0 && h==0){
            count++;
            System.out.print(p+" ");
            return;
        }
        if(v!=0)path(p+"V",v-1,h);
        if(h!=0)path(p+"H",v,h-1);
        if(v!=0 && h!=0)path(p+"D",v-1,h-1);
    }
}
