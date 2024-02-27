import java.util.Scanner;

public class Ques13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String names = sc.nextLine().trim();
        int check = sc.nextInt();
        String[] arr = names.split(" ");

        for(int i=arr.length-1;i>=0;i--){
            System.out.println(i+1 + " " + arr[i]);
        }
        if(check >= arr.length){
            System.out.println("not present");
        }
        else{
            System.out.println("present");
        }
    }
}
