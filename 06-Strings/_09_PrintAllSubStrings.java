/* Print all possible substrings of String*/

public class _09_PrintAllSubStrings {

    public static void printSubstrings(String str) {

        for (int start = 0; start <= str.length(); start++) {
            for (int end = start + 1; end <=str.length(); end++) {
                String substring = str.substring(start, end);
                System.out.println(substring);
            }
        }
    }

    public static void main(String[] args) {
        String str = "abcdef";
        printSubstrings(str);
    }
}