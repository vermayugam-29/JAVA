public class Worker extends Human{
    String organization;
    Worker(int age, int salary, String name, String organization) {
        super(age, salary, name);
        this.organization = organization;
    }
}
