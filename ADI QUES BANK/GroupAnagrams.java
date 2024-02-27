import java.util.*;

public class GroupAnagrams {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String[] arr = new String[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.next();
        }

        List<List<String>> ans = new ArrayList<>();
        List<String> list2 = new ArrayList<>();

        for(int i=0;i<arr.length;i++){
            List<String> list = new ArrayList<>();
            if(!arr[i].equals("error")) list.add(arr[i]);
            for(int j=i+1;j<arr.length;j++){
                if(!arr[j].equals("error")){
                    if(check(arr[i],arr[j])){
                        list.add(arr[j]);
                        arr[j] = "error";
                    }
                }
            }
            if(!list.isEmpty()) {
//                Collections.sort(list);
//                Collections.reverse(list);
                ans.add(list);
            }
        }

        //DISPLAY
        for(List<String> list : ans) {
            for (String s : list) {
                System.out.print(s + " ");
            }
            System.out.println();
        }
    }
    static boolean check(String str1,String str2){
        if(str1.length() != str2.length()) return false;
        int[] hash1 = new int[26];
        int[] hash2 = new int[26];

        for(int i=0;i<str1.length();i++){
            hash1[str1.charAt(i) - 'a']++;
            hash2[str2.charAt(i) - 'a'] ++;
        }
        for(int i=0;i<26;i++){
            if(hash1[i] != hash2[i]) return false;
        }
        return true;
    }
}
