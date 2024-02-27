//Ques Statement
//You are given an integer N. You can swap two digits at most once to get the maximum valued number
// and the swap is called as Magic Swap
//Print the value of N after performing Magic Swap operation on N .
import java.util.*;
public class MagicSwapNumbber {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n == 0){
            System.out.println(0);
        }
        else if(n > 0){
            solve(n);
        }
        else if(n < 0){
            solve2(n);
        }
    }
    static void solve(int n){
        ArrayList<Integer> list = new ArrayList<>();
        String a = String.valueOf(n);
        for(int i=0;i<a.length();i++){
            list.add(a.charAt(i) - '0');
        }
        a = "";
        int max = 0;
        for(int i=0;i<list.size();i++){
            if(list.get(max) < list.get(i)){
                max = i;
            }
        }
        swap(list,0,max);
        for(int i=0;i<list.size();i++){
            a += list.get(i);
        }
        System.out.println(Integer.parseInt(a));
    }
    static void swap(List<Integer> list,int i,int j){
        int temp = list.get(i);
        list.set(i,list.get(j));
        list.set(j,temp);
    }
    static void solve2(int n){
        ArrayList<Integer> list = new ArrayList<>();
        String a = String.valueOf(n);
        for(int i=1;i<a.length();i++){
            list.add(a.charAt(i) - '0');
        }
        a = "";
        int min = 0;
        for(int i=0;i<list.size();i++){
            if(list.get(min) > list.get(i)){
                min = i;
            }
        }
        swap(list,0,min);
        for(int i=0;i<list.size();i++){
            a += list.get(i);
        }
        System.out.println(-1*Integer.parseInt(a));
    }
}