import java.util.*;

public class StringMatchQuesExam29Jan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pass = sc.next();
        String[] arr = new String[5];

        String str = "";
        for(int i =0;i<5;i++){
            arr[i] = sc.next();
            str += arr[i];
        }

        int idx = str.indexOf(pass);

        if(idx == -1){
            System.out.println(-1);
        }
        else{
            idx = idx + pass.length();

            for (int i = 0; i < arr.length; i++) {
                idx -= arr[i].length();
                if(idx <= 0 ){
                    idx = i+ 1;
                    break;
                }
            }
            System.out.println(idx);
        }
    }
}
