import java.util.ArrayList;
import java.util.List;

public class MultipleElementOccur {
    public static void main(String[] args) {
        int[] arr = {1,2,5,6,4,3,3,4,9};
        int target = 4;

        int first = firstOccur(arr,target,0);
        int last = lastOccur(arr,target,arr.length-1);

        System.out.println("First Occurance:" + first);
        System.out.println("Last Occurance:" + last);


        List<Integer> list = new ArrayList<>();
        ocurance(arr,target,0,list);
        System.out.println(list);
    }
    //method 2 using arraylist---------------------------------------
    static void ocurance(int[] arr,int target,int idx,List<Integer> list){
        if(idx >= arr.length){
            return;
        }
        if(arr[idx]==target){
            list.add(idx);
        }
        ocurance(arr,target,idx+1,list);
    }
    //method 1----------------------------------------------------------
    static int firstOccur(int[] arr,int target,int idx){
        if(idx >= arr.length){
            return -1;
        }
        if(arr[idx] == target){
            return idx;
        }
        return firstOccur(arr,target,idx+1);
    }
    static int  lastOccur(int[] arr,int target,int idx){
        if(idx < 0){
            return -1;
        }
        if(arr[idx] == target){
            return idx;
        }
        return lastOccur(arr,target,idx-1);
    }
}
