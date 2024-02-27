import java.util.Scanner;

public class ReverseWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String[] arr = str.split(" ");
        String a = "";

        for (int i = 0; i < arr.length; i++) {
            a = a + reversed(arr[i]) + " ";    
        }
        //replaceAll is used for removing extra spaces
        a = a.replaceAll(" +", " ");
        //trim() is used  for removing unnecessary spaces from last and end
        System.out.println(a.trim());

        //using stringbuilder function -----------------------------------------------------
        String ans = UsingBuilder(str);
        System.out.println(ans);
    }
    public static String reversed(String str){
        String a = "";
        for (int i = str.length()-1; i >= 0; i--) {
            a = a + str.charAt(i);
        }
        return a;
    }
    public static String UsingBuilder(String str){
        String ans = "";
        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < str.length(); i++) {
            //adding elements to stringBuiled and ignoring if sting has spaces 
            if(str.charAt(i) != ' '){
                sb.append(str.charAt(i));
            }
            else{
                //reversing elements in string builder
                sb.reverse();
                //adding reversed elements from string builder to string ans
                ans += sb + " ";
                //empting string builder
                sb.setLength(0); ///or sb.delete(0,sb.length());
            }
        }
        //because the else condition hits only when str.charAt(i) == " "; but in case of last letter there is no
        //space  after so the else condition never runs
        //but the last word always remains in string builder so we added it to mmake our output correct
        ans += sb.reverse();
        return ans;
    }
}
