/* You are given an integer n. If the number is less than zero then the print ‘Negative’ otherwise the print ‘Positive’.
*/

import java.util.*;

public class _001_Positive_Negative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number");
        int num = sc.nextInt();

        if (num >= 0) {
            System.out.println("Number is Positive");
        } else {
            System.out.println("Number is Negative");
        }
        sc.close();

    }
}