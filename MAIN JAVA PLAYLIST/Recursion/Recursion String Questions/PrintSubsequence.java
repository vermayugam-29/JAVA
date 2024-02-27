//--------------------------------Recursive tree-----------------------------------------
/*
                                         f("","abc")

                     f("a","bc")                                             f("","bc")

         f("ab","c")               f("a","c")                   f("b","c")              f("","c")

   f("abc","")   f("ab","")   f("ac","") f("a","")          f("bc","")  f("b","")    f("c","")  f("","")
 */


public class PrintSubsequence {
    public static void main(String[] args) {
        String up = "abc"; //up = un processed string or we can say it as original string
        subseq("",up);
        System.out.println(up);
    }
    static void subseq(String p,String up){//p is proccesed or say it as ans string which we will be printing
        //base condition when up  becomes empty print our abs string
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        //we will have two choices either we take char or we remove it
        subseq(p+ch,up.substring(1));//case when we take char
        subseq(p,up.substring(1));//case when we skip our char and pass an empty string
    }
}
