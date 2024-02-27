public class SB {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        //printing alphabets---------------------------------------
        for (int i = 0; i < 26; i++) {
            char ch = (char)('a' + i);
            sb.append(ch + " ");
        }

        System.out.println(sb);
    }
}
