
public class OOP2 {
    public static void main(String[] args) {

        Human yugam = new Human(20,"Yugam",false);
        Human raghav = new Human(20,"Raghav",false);

//        System.out.println(Human.population);
//        greet();//we can't use non-static inside a static function


        //now we created an object to call a no static function so this fill work fine
        OOP2 obj = new OOP2();
        obj.greet();

    }
    //this function we created is non-static, and it is dependent on objects
    void  greet(){
        System.out.println("Hello i am yugam");
    }
}
