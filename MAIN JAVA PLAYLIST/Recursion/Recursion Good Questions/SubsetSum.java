import java.util.ArrayList;
import java.util.List;

public class SubsetSum {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        int target = 7;
        boolean ans = subsetBool(arr,0,0,target);
        System.out.println(ans);
    }

    //coding ninja ques solutions----------------------------------------------------------------------------------

    static boolean subsetBool(int[] arr,int i,int sum,int target){
        if(i == arr.length){
            if(sum == target){
                return true;
            }
            else{
                return false;
            }

        }

        sum = sum + arr[i];
        if(subsetBool(arr,i+1,sum,target)) return true;
        sum = sum -arr[i];
        if(subsetBool(arr,i+1,sum,target)) return true;
        return false;
    }
}




//=----------------------------------
/*
static List<Integer> list = new ArrayList<>();
    static List<List<Integer>> outer = new ArrayList<>();
    static void subset(int[] arr,int i,int sum,int target){
        if(i == arr.length){
            if(sum == target){
                outer.add(new ArrayList<>(list));
            }
            return;
        }

        list.add(arr[i]);
        sum += arr[i];
        subset(arr,i+1,sum ,target);
        list.removeLast();
        sum -= arr[i];
        subset(arr,i+1,sum ,target);
    }
 */