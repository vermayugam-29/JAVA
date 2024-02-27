//Ques Statement : -
//Given a non-negative integer num, repeatedly add all its digits until the result has only one digit.
import java.util.*;
public class AddDigits {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);

        int num = 38;//sc.nextInt();
        System.out.println(addDigits(num));
    }
    static int addDigits(int num) {
        //if num is already single digit or when num becomes single digit after recursive calls
        if(num < 10) return num;

        int sum = 0;
        //calculating sum of digits say num = 38 so sum = 3 + 8 = 11
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        //now num== 11 so this  will call this fi=unction again until num is single digit number
        return addDigits(sum);
    }
}