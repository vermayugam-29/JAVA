public class Human {
        int age;
        String name;
        boolean married;
        static long population;

        public Human(int age,String name,boolean married){
            this.age = age;
            this.name = name;
            this.married = married;

            //whenever a new human is being created increase population by 1
            Human.population += 1;
        }
}
