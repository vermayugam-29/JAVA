//Ques Statement:-
//Take an input N, a number. Take N more inputs and store that in an array. Take an input target, a number
//
//a Write a recursive function which prints subsets of the array which sum to target.
//
//b Write a recursive function which counts the number of subsets of the array which sum to target.
// Print the value returned.
import java.util.*;
public class TargetSumSubset {
    static int count = 0;
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();

        List<Integer> list = new ArrayList<>();
        subset(arr,0,target,list);
        System.out.println();
        System.out.println(count);
    }
    static void subset(int[] arr,int idx,int target,List<Integer> list){
        if(idx == arr.length){
            if(check(list,target)){
                count++;
                print(list);
            }
            return;
        }

        list.add(arr[idx]);
        subset(arr,idx+1,target,list);
        list.remove(list.size()-1);
        subset(arr,idx+1,target,list);
    }
    static boolean check(List<Integer> list,int target){
        int sum = 0;
        for(int  i=0;i<list.size();i++){
            sum += list.get(i);
        }
        return sum == target;
    }
    static void print(List<Integer> list){
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i) + " ");
        }
        System.out.print(" ");
    }
}
