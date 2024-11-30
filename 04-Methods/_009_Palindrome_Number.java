/*   
 
     Check whether a given number ’n’ is a palindrome number.

      Note :
      Palindrome numbers are the numbers that don't change when reversed.
      You don’t need to print anything. Just implement the given function.
*/

import java.util.*;

public class _009_Palindrome_Number {

    public static boolean palindromeNumber(int num) {
        int rev = 0;
        int cpy = num;
        while (num > 0) {
            int last_digit = num % 10;
            num = num / 10;
            rev = rev * 10 + last_digit;
        }
        if (cpy == rev) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Num: ");
        int num = sc.nextInt();

        System.out.println(palindromeNumber(num) + " -Number is palindrome");

        sc.close();
    }
}