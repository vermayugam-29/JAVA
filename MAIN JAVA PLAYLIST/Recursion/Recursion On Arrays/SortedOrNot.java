public class SortedOrNot {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(check(arr,0));
    }
    static boolean check(int[] arr,int  idx){
        if(idx == arr.length-1){
            return true;
        }

        return arr[idx]<=arr[idx+1] && check(arr,idx+1);
    }
}
