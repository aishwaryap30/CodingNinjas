/*Given a number, print " Multiple of 5" if the number is a multiple of 5, otherwise print "Not a Multiple of 5"

for N = 5
"Multiple of 5"  */

import java.util.*;

public class _004_MultipleOf5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number");
        int n = sc.nextInt();

        if (n % 5 == 0) {
            System.out.println("Multiple of 5");
        } else {
            System.out.println("Not a Multiple of 5");
        }
        sc.close();

    }
}