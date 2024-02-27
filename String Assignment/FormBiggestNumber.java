import java.util.*;

public class FormBiggestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int test = sc.nextInt();//no of test case
        int n = sc.nextInt();//length of array

       while(test > 0){
           ArrayList<String> list = new ArrayList<>();
           int[] arr = new int[n];
           for (int i = 0; i < n; i++) {
               arr[i] = sc.nextInt();
               list.add(String.valueOf(arr[i]));
           }
           Collections.sort(list);
           System.out.println(list);

           for (int i = list.size()-1; i >=0 ; i--) {
               System.out.print(list.get(i));
           }

           test--;
       }
    }
}
