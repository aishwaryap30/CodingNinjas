/* Reverse String */

public class _01_ReverseString {

    public static String reverse(String str) {
        StringBuilder rev = new StringBuilder();

        for (int i = str.length() - 1; i >= 0; i--) {
            rev.append(str.charAt(i));
        }
        return rev.toString();
    }

    public static void main(String[] args) {
        String str = "abcdef";
        String ans = reverse(str);

        System.out.println(ans);
    }
}