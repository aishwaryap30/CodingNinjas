/*     
                  program to find Factorial of given Number
   
*/

import java.util.*;

public class _002_Factorial_of_Number {

    public static int calculateFactorial(int num) {
        int fact = 1;

        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int num = sc.nextInt();

        System.out.println("Factorial : " + calculateFactorial(num));

        sc.close();
    }
}