import java.util.*;

public class Ques14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine().trim();

        String[] str2 = str.split(" ");
        int[] arr = new int[str2.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(str2[i]);
        }

        System.out.println(solve(arr));

    }
    static int solve(int[] arr){
        int oddSum = 0;
        int evenSum = 0;
        for(int i=0;i<arr.length;i++){
            if(i%2 == 0){
                evenSum += arr[i];
            }
            else{
                oddSum += arr[i];
            }
        }

        int count = 0;

        for(int i=0;i<arr.length;i++){
            if(i%2 == 0){
                evenSum -= arr[i];
            }else{
                oddSum -=arr[i];
            }

            if(oddSum == evenSum){
                count++;
            }
        }

        //return count
        return count;
    }
}
