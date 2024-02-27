import java.util.*;

public class EvenDigitCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // my own method ------------------------------------------------------------------
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            while(arr[i] > 0){
                arr[i] = arr[i]/10;
                count++;
            }
            if(count%2 == 0){
                list.add(arr[i]);
            }
        }
        System.out.println(list.size());
    }
}
