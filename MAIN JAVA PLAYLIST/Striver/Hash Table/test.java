public class test {
    public static void main(String[] args) {
        //give anything to hashcode it will convert it into a number
        String name = "Yugam";
        Integer a = 7856;//cannot use primitive datatypes to convert to hash code that is why we used 'Integer'

        int code = a.hashCode();
        int code2 = name.hashCode()%10;

        System.out.println(code);
        System.out.println(code2);
    }
}