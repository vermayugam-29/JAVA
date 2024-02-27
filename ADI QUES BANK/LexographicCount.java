import java.util.*;

public class LexographicCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        List<String> list = new ArrayList<>();
        for(int i=1;i<=n;i++){
            list.add(String.valueOf(i));
        }
        Collections.sort(list);
        System.out.println(list);
    }
}
