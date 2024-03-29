/* Given an integer N, print all the prime numbers that lie in the range 2 to N (both inclusive).*/

import java.util.*;

public class _013_PrintAll_PrimNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number to print prime number from 2-num");
        int num = sc.nextInt();

        for (int n = 2; n <= num; n++) {
            boolean isprime = true;

            for (int i = 2; i < n; i++) {

                if (n % i == 0) {
                    isprime = false;
                    break;
                }
            }
            if (isprime) {
                System.out.print(n + " ");
            }
        }
        sc.close();
    }
}