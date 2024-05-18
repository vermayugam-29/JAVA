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
    static int solve(int[] nums,int bricks,int ladders){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=1;i<nums.length;i++){
            if(nums[i-1] < nums[i]){
                int diff = nums[i] - nums[i-1];
                pq.add(diff);
                if(pq.size() > ladders){
                    bricks -= pq.poll();
                }
            }
            if(bricks < 0) return i-1;
        }
        return nums.length-1;
    }
}
