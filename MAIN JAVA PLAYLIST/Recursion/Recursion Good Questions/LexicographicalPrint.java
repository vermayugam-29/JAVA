import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LexicographicalPrint {
    public static void main(String[] args) {
        for(int i=1;i<10;i++){
            dfs(i,13);
        }
        System.out.println(list);
    }
    static List<Integer> list = new ArrayList<>();
    static void dfs(int i,int n){
        if(i > n) return;
        list.add(i); //add current element
        for(int j=0;j<10;j++){
            dfs((10*i)+j,n);//call for family of curr element
        }
        //Note : i = curr element and j = further family of i
    }
}
