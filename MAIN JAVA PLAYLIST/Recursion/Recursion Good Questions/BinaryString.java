//https://www.codingninjas.com/studio/problems/-binary-strings-with-no-consecutive-1s._893001?utm
// _source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTabValue=PROBLEM


public class BinaryString {
    public static void main(String[] args) {
        int n = 3;
        print("",3);

    }
    static void print(String p,int n) {
        if (n == 0) {
            System.out.println(p);
        }

        if (n != 0) print(p + "0", n - 1);
        if(n!=0 && p.isEmpty()) print(p + "1",n-1);
        if (n != 0 && !p.isEmpty()) {
            if (p.length() >= 1 && p.charAt(p.length() - 1) != '1') {
                print(p + "1", n - 1);
            }
        }
    }
}
