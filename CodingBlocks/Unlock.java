import java.util.*;
public class Unlock {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();//size of array
        int max = sc.nextInt();//max swaps

        int[] arr = new int[n];
        int[] arr2 = new int[n];
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
            arr2[i] = arr[i];
            map.put(arr[i],i);
        }
        Arrays.sort(arr2);

        int swap = 0;
        int j = 0;//pointer for array1;
        int k = arr2.length-1;//pointer for array2

        while(swap < max && j<arr.length && k>=0){
            if(arr[j] != arr2[k]){
                // int end = findIndex(arr,arr2[k]);
                int end = map.get(arr2[k]);
                swapping(arr,j,end);

                map.put(arr[j],j); // jo element swap hokr age aya uska index update kar diya
                map.put(arr[end],end); //jis element se swap kiya tha uska index update kar diya
                swap++;
            }
            j++;
            k--;
        }

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }

    }
    public static void swapping(int[] arr,int start,int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
    public static int findIndex(int[] arr,int element){
        for(int i=0;i<arr.length;i++){
            if(arr[i] == element){
                return i;
            }
        }
        return -1;
    }
}