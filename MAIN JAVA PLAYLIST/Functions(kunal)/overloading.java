public class overloading {
    public static void main(String[] args) {
        fun(45);
        fun(7,9);
    }
    static void fun(int a){
        System.out.println(a);
    }
    static void fun(int b,int c){
        System.out.println(b*c);
    }
}
