public class Shadowing {
    static int x = 90;
    public static void main(String[] args) {
        System.out.println(x); // 90
        int x = 96; //the class variable at line 2 is shadowed by this 
        System.out.println(x);  //96
        fun();  // 90
}
    static void fun(){
        System.out.println(x);
    }
}
