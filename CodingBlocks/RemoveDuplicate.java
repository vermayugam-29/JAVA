import java.util.*;

public class RemoveDuplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();

        System.out.println(Remove(a));
    }
    static String Remove(String a){
        StringBuilder sb = new StringBuilder();
        LinkedHashSet<Character> set = new LinkedHashSet<>();
        for (int i = 0; i < a.length(); i++) {
            set.add(a.charAt(i));
        }

        for(Character e: set){
            sb.append(e);
        }
        return sb.toString();
    }
}
