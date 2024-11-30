/*  Check whether string is palindrome or not 
   The string conatins alphanumeric characters, special symbols , whitespaces. */

public class _04_StringPalindrome2 {

    public static boolean palindrome(String str) {
        int start = 0;
        int end = str.length() - 1;

        while (start < end) {

            while (start < end && !Character.isLetterOrDigit(str.charAt(start))) {
                start++;
            }
            while (start < end && !Character.isLetterOrDigit(str.charAt(end))) {
                end++;
            }

            if (Character.toLowerCase(str.charAt(start)) != Character.toLowerCase(str.charAt(end))) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "abba";
        boolean ans = palindrome(str);
        System.out.println(ans);
    }
}