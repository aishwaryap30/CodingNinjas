/* Remove consecutive duplicates from String recursively */

public class _06_RemoveConsecutiveDuplicates_Recursively {

    public static String removeDuplicates(String str) {

        if (str == null || str.length() <= 1) {
            return str;
        }
        if (str.charAt(0) == str.charAt(1)) {
            return removeDuplicates(str.substring(1));
        }
        return str.charAt(0) + removeDuplicates(str.substring(1));
    }

    public static void main(String[] args) {
        String str = "aaabccdddeef";
        String ans = removeDuplicates(str);
        System.out.println(ans);
    }
}