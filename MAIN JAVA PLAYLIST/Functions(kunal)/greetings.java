import java.util.Scanner;

public class greetings {
    public static void main(String[] args){
        // String msg = greet();
        // System.out.println(msg);

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Name:");
        String naam = sc.next();
        String message = myName(naam);
        System.out.println(message);
    }

    static String myName(String name){
        String output = "Hello " + name;
        return output;
    }

    static String greet(){

        String greetings = "What do you do?";
        return greetings;
    }
}