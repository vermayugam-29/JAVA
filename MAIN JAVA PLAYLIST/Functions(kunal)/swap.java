public class swap {
    public static void main(String[] args) {
        swap();
    }

    static int swap(){
        int a = 10;
        int b = 20;
        
        int temp = a;
        a = b;
        b = temp;
        return temp;
    }
}
