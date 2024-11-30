/*   
  
          Program to find GCD stands for "Greatest Common Divisor." 
          It refers to the largest positive integer that divides two or more numbers without leaving a remainder. 
*/

import java.util.*;

public class _008_Greatest_common_Divisor {

    public static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a: ");
        int a = sc.nextInt();

        System.out.print("Enter a: ");
        int b = sc.nextInt();

        System.out.println("GCD: " + findGCD(a, b));

        sc.close();
    }
}