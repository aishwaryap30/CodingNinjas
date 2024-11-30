/* count frequency of each character A-Z */

public class _07_CountFrequency_OfCharacters {

    public static int[] count(String str) {

        int[] freq = new int[26];

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                freq[ch - 'a']++;
            }
        }
        return freq;
    }

    public static void main(String[] args) {

        String str = "abcmnoywrtyadfgtmnaropiuyef";
        int[] ans = count(str);

        // Print frequencies from 'a' to 'z'
        for (int count : ans) {
            System.out.print(count + " ");
        }
    }
}