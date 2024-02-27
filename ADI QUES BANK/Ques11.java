import java.util.*;

public class Ques11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine().trim();//integer array
        int bricks = sc.nextInt();
        int ladder = sc.nextInt();

        String[] str = s.split(" ");

        int[] arr = new int[str.length];
        for(int i=0;i<arr.length;i++){
            arr[i] = Integer.parseInt(str[i]);
        }

        System.out.println(solve(arr,bricks,ladder));
    }
    static int solve(int[] arr,int bricks,int ladder){
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i] < arr[i+1]){
                if(bricks > 0){
                    bricks = bricks - (arr[i+1] - arr[i]);

                }
                else if(ladder > 0){
                    ladder = ladder -1;
                }
                else{
                    return i;
                }
            }
        }
        return arr.length-1;
    }
}
