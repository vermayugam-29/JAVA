import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class JosephusProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 5;//sc.nextInt();
        int k = 1;//sc.nextInt();

        List<Integer> list = new ArrayList<>();
        for(int i=1;i<=n;i++){
            list.add(i);
        }

        int ans = gameOfDeath(list,0,k-1);
        System.out.println(ans);
    }
    static int gameOfDeath(List<Integer> list,int idx,int k){
        if(list.size() == 1){
            return list.get(0);
        }

        //updating idx and doing it modulo by size because if index comes at last index then it will give
        //index Out of bound error
        idx = (idx + k) % list.size();

        list.remove(idx);

        //recursive call
        return gameOfDeath(list,idx,k);
    }
}
