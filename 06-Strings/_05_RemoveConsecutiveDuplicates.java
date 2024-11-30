/* Remove consecutive duplicates from String */

public class _05_RemoveConsecutiveDuplicates {

    public static String removeDuplicates(String str) {
        String s = "";
        int temp = Integer.MIN_VALUE;

        for (int i = 0; i < str.length(); i++) {
            if ((int) str.charAt(i) != temp) {
                s += str.charAt(i);
            }
            temp = str.charAt(i);
        }
        return s;
    }

    public static void main(String[] args) {
        String str = "aaabccddde";

        String ans = removeDuplicates(str);
        System.out.println(ans);
    }
}