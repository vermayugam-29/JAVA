public class SkipAString {
    public static void main(String[] args) {
        String s = "AppleBananaApplecatbatratAppleVAT";
        String toSkip = "Apple";
        System.out.println(remove(s,toSkip));
    }
    static String remove(String s,String a){
        if(s.isEmpty()) return "";
        if(s.startsWith(a)) return remove(s.substring(a.length()),a);
        return s.charAt(0) + remove(s.substring(1),a);
    }
}
