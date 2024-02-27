public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int target = 5;

        System.out.println(findElement(arr,target,0));
    }
    static int findElement(int[] arr,int target,int idx){
        if(idx >= arr.length){
            return -1;
        }
        if(arr[idx] == target){
            return idx;
        }
        return findElement(arr,target,idx+1);
    }
}
