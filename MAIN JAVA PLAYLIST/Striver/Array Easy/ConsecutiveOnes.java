import java.util.*;
public class ConsecutiveOnes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < nums.length; i++) {
            nums[i]= sc.nextInt();
        }
        // ArrayList<Integer> list =  new ArrayList<>();
        // ArrayList<Integer> non =  new ArrayList<>();
        int count = 0;
        int max = 0;
        for (int i=0;i<nums.length;i++){
            if(nums[i] == 1){
                count++;
            }
            else{
                if(count > max){
                    max = count;
                }
                count = 0;
            }
        }
        if(count > max){
            max = count;
        }
        System.out.println(max);

    }
}
/*
 * input = 1,1,0,1,1,1
 */
