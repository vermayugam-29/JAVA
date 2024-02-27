public class SkipAString2 {
    public static void main(String[] args) {
        String s = "bcdeApplcbde";
        System.out.println(remove(s));
    }
    static String remove(String s){
        if(s.isEmpty()) return "";

        if(s.startsWith("App") && !s.startsWith("Apple")){
            return remove(s.substring(3));
        }
        return s.charAt(0)+remove(s.substring(1));
    }
}
