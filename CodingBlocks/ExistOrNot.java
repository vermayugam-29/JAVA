import java.util.*;
public class ExistOrNot {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();//no of test case 

        while(test > 0){
            int n = sc.nextInt();//size of array
            Set<Integer> set = new HashSet<>();
            for(int i=0;i<n;i++){
                set.add(sc.nextInt());
            }

            int new_test = sc.nextInt();

            while(new_test > 0){
                int a = sc.nextInt();
                if(set.contains(a)){
                    System.out.println("Yes");
                }
                else{
                    System.out.println("No");
                }
                new_test--;
            }
            test--;
        }
    }
}