
/* For a given two strings, 'str1' and 'str2', 
check whether they are a permutation of each other or not.

Permutations of each other
Two strings are said to be a permutation of each other
when either of the string's characters can be rearranged 
so that it becomes identical to the other one.

*/
import java.util.*;

public class _10_CheckPermutation {

    public static boolean checkPermutation(String str1, String str2) {

        if (str1.length() != str2.length()) {
            return false;
        }
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str1 = "sinrtg";
        String str2 = "string";

        boolean ans = checkPermutation(str1, str2);
        System.out.println(ans);

    }
}