/* 

         Create a function that determines whether a given number N belongs to the Fibonacci sequence. 
         If N is found in the Fibonacci sequence, the function should return true; otherwise, it should return false.
*/

import java.util.*;

public class _010_number_N_belongs_to_Fibonacci_sequence {

    public static boolean checkMember(int n) {
        int num = n;
        int sum = 0;
        int i = 1;
        int first_dig = 0;
        int second_dig = 1;
        if (num == first_dig || num == second_dig) {
            return true;
        }
        while (i <= num) {
            sum = first_dig + second_dig;

            first_dig = second_dig;
            second_dig = sum;
            i++;
            if (num == sum) {
                return true;
            }

        }
        return false;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int n = sc.nextInt();

        System.out.println(checkMember(n));

        sc.close();
    }
}