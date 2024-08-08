public class Main {
    public static void main(String[] args) {
        Human yugam = new Human(20, 0, "Yugam");
        Human akshit = new Human(21, 0, "Akshit");

        System.out.println(Human.population);

        new Main().call();
        Demo d1 = new Main().new Demo(12);
        Demo d2 = new Main().new Demo(13);

        System.out.println(d1);

        Singleton obj = Singleton.getInstance();

//        Worker dummy = new Human(20,0,"Yugam");
    }
    void call () {
        greet();
    }
    void greet() {
        System.out.println("Hello ! World");
    }
    class Demo {
        static int age;
        Demo (int age) {
            Demo.age = age;
        }

        @Override
        public String toString() {
            return "Your age is " + age;
        }
    }
}