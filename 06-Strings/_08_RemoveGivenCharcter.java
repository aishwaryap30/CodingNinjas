/* Remove given Character from string */

public class _08_RemoveGivenCharcter {

    public static String removeCharacter(String str, char ch) {

        String s = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ch) {
                s += str.charAt(i);
            }
        }
        return s;
    }

    public static void main(String[] args) {
        String str = "abcdef";
        char ch = 'a';

        String ans = removeCharacter(str, ch);
        System.out.println(ans);
    }
}