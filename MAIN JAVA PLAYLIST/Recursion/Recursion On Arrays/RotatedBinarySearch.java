public class RotatedBinarySearch {
    public static void main(String[] args) {
        int[] arr = {5,6,7,1,2,3};
        int target = 5;

        System.out.println(Binary(arr,target,0,arr.length-1));
    }
    static int Binary(int[] arr,int target,int start,int end){
        //base condition
        if(start > end){
            return -1;
        }


        int mid = start + (end-start)/2;
        if(arr[mid] == target){
            return mid;
        }
        //eg :- arr = 5,6,7,8
        //take eg mid = 8 and start = 5 and target = 7
        else if(arr[start] <= arr[mid]){
            if(target >= arr[start] && target <= arr[mid]){
                return Binary(arr,target,start,mid-1);
            }
            else{
                return Binary(arr,target,mid+1,end);
            }
        }

        //eg :- 5,6,1,2,3,4
        //start = 5 and end = 4 and mid = 1 and target=2
        else if(target >= arr[mid] && target<=arr[end]){
            return Binary(arr,target,mid+1,end);
        }

        return Binary(arr,target,start,mid-1);
    }
}
