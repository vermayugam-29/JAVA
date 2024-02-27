import java.util.Scanner;

public class Ques34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int egg = sc.nextInt();
        int floor = sc.nextInt();

        int ans = eggDrop(egg,floor);

        System.out.println(ans);
    }
    static int eggDrop(int egg,int floors){
        //Base Case
        if(floors == 0 || floors == 1){//means we have reached the only floor left
            return floors;
        }
        if(egg == 1){//means we have reached the only egg left
            return floors;
        }

        int minSteps = Integer.MAX_VALUE;
        for (int k = 1; k <= floors; k++) {
            int eggBreaked = eggDrop(egg-1,k-1);
            int eggNotBreaked = eggDrop(egg,floors-k);

            // The reason we take max is we want the worst case scenario which guarantees
            // that the such a floor (i.e. threshold floor) will be found
            int maxOfWorstCase = 1 + Math.max(eggBreaked,eggNotBreaked);

            minSteps = Math.min(minSteps,maxOfWorstCase);
        }

        return minSteps;
    }
}
