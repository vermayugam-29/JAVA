import java.util.Arrays;
import java.util.Scanner;

public class LeetCode744 { //celining in character array
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] letters = sc.next().toCharArray(); //input of char array
        // System.out.println(Arrays.toString(letters));
        char target = sc.next().trim().charAt(0);//input of char target
        System.out.print(nextGreatestLetter(letters,target));
    }
    public static char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;
        while(start<=end){
            int mid = start + (end - start)/2;

            if(target  < letters[mid]){
                end = mid -1;
            }
            else{
                start = mid + 1;
            }
        }
        return letters[start % letters.length];
    }
}
