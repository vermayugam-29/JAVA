import java.util.*;

public class InfiniteSortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();
        int temp = sc.nextInt();
        list.add(temp);
        while(temp != -1){
            temp = sc.nextInt();
            list.add(temp);
        }
        int target = sc.nextInt();
        System.out.println(ans(list, target));
    }
    public static int ans(ArrayList<Integer> list,int target){
        int start = 0;
        int end = 1;
        while(target > list.get(end)){
            int newStart = end + 1;
            //end = previous end + 2*sizeofpreviousArray
            end = end + 2*(end-start+1);
            start = newStart;

        }
        return BinarySearch(list,target,start,end);
    }
    public static int BinarySearch(ArrayList<Integer> list,int target,int start,int end){
        while(start<=end){
            int mid = start + (end-start)/2;
            if(target < list.get(mid)){
                end = mid -1;
            }
            else if(target > list.get(mid)){
                start = mid + 1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
