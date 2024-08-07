class Human {
    int age, salary;
    String name;
    static int population;

    Human (int age, int salary, String name) {
        this.age = age;
        this.salary = salary;
        this.name = name;
        Human.population += 1;
    }
}