/* 
   task is to reverse the original string word by word.
          Input  :  Welcome to Coding Ninjas
          Output :  Ninjas Coding to Welcome
*/

public class _02_ReverseWordsInString {

    public static String reverseWords(String str) {
        if (str == null || str.trim().isEmpty()) {
            return str;
        }

        StringBuilder rev = new StringBuilder();
        String[] words = str.trim().split("\\s+");

        for (int i = words.length - 1; i >= 0; i--) {
            rev.append(words[i]);
            if (i != 0) {
                rev.append(" ");
            }
        }
        return rev.toString();
    }

    public static void main(String[] args) {
        String str = "It's a beautiful place";

        String ans = reverseWords(str);
        System.out.println(ans);
    }
}