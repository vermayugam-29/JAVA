public class OOPS1 {
    public static void main(String[] args) {
        Student[] students = new Student[5];

//
//        Student yugam = new Student();
//
//        System.out.println("Before initializing :- " +yugam.rollNo+ " " +yugam.name+" "+yugam.marks);
//
//        yugam.rollNo = 1596;
//        yugam.name = "Yugam";
////        yugam.marks = 89.4f;
//
//        System.out.println("After initializing :- " +yugam.rollNo+ " " +yugam.name+" "+yugam.marks);
//
//        //in case we give default values in classes
//        System.out.println("If we give default values :- " +yugam.rollNo+ " " +yugam.name+" "+yugam.marks);








        //using this keyword=-----------------------------------------------
//        Student yugam = new Student();
//        System.out.println(yugam.rollNo);
//        System.out.println(yugam.name);
//        System.out.println(yugam.marks);








        //passing arguments in constructor-----------------------------------------------------
//        Student raghav = new Student(24,"Raghav",67.8f);
//
//        raghav.changeName("Yugam"); //changing name
//
//        System.out.println(raghav.rollNo);
//        System.out.println(raghav.name);
//        System.out.println(raghav.marks);
//
//        raghav.message();






        //-------------------------------------------------------
//        Student akshit = new Student(12,"Akshit",95.3f);
//        Student tanmay = akshit;
//
//        //if we change something in akshit this will also affect tanmay  because in heap they are pointing towards
//        //same object
//        akshit.name = "Tanmay";
//        System.out.println(tanmay.name);
//
//        //if we change tanmay name  this will also act the same way
//        tanmay.name = "yugam";
//        System.out.println(akshit.name);





        //final keyword----------------------------------------
        final int count = 4;
        //count = 8;//gives error

    }
}

//making our own class ---------------------------------------------------------------------------------------------
class Student{
    int rollNo;
    String name ;
    float marks=90;

    //printing in class and calling in main
    void message(){
        System.out.println("Hello my name is " + this.name);
    }
    //changing values allocated  to  variables  in class
    void changeName(String name){
        this.name = name;
    }

    //using this keyword
    Student() { //Note : - when you call a function without passing any arguments then this thing will be executed
        this.rollNo = 34;
        this.name = "Yugam";
        this.marks = 89.2f;
    }
    //passing arguments in constructor
    Student(int rollNo,String name,float marks){
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }
}
