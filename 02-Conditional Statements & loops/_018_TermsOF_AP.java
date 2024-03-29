/*Write a program to print first x terms of the series 3N + 2 which are not multiples of 4.
 */

import java.util.*;

public class _018_TermsOF_AP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter X");
        int x = sc.nextInt();

        for (int n = 1; n <= x; n++) {
            int y = (3 * n) + 2;
            if (y % 4 != 0) {
                System.out.print(y + " ");
            } else if (y % 4 == 0) {
                x += 1;
            }
        }

        sc.close();
    }
}