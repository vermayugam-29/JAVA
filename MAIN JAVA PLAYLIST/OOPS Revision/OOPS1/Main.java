public class Main {
    public static void main(String[] args) {
        Student st1 = new Student(1596, 20, "Yugam");
        Student st2 = new Student(1112, 21, "Raghav");

        Student st3 = st2;
        System.out.println(st2.name);
        st3.name = "Khattar";
        System.out.println(st2.name);
    }
}
class Student {
    int roll , age;
    String name;

    Student (Student st) {
        this.roll = st.roll;
        this.name = st.name;
        this.age = st.age;
    }

    Student (int roll, int age, String name) {
        this.roll = roll;
        this.age = age;
        this.name = name;
    }
}
