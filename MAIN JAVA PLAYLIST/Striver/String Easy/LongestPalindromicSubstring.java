public class LongestPalindromicSubstring {
    public static void main(String[] args) {
        String str = "abcd";
        System.out.println(longestPalindrome(str));
    }

    public static String longestPalindrome(String s) {
        String a = "";
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                if (isPalindrome(s.substring(i, j))) {
                    a += s.substring(i, j) + " ";
                }
            }
        }

        String[] arr = a.split(" ");
        int maxIdx = arr[0].length();
        int idx = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length() > maxIdx) {
                maxIdx = arr[i].length();
                idx = i;
            }
        }
        return arr[idx];
    }

    public static boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}