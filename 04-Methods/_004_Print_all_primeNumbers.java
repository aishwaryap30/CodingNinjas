/*
            Program to print all Prime Numbers till given limit:
*/

import java.util.*;

public class _004_Print_all_primeNumbers {

    public static boolean isprime(int num) {

        for (int i = 2; i < num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void printPrimes(int limit){

        for(int i=2; i<=limit ; i++){

            if(isprime(i)){
                System.out.print(i+" ");

            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Limit: ");
        int limit = sc.nextInt();

        printPrimes(limit);

        sc.close();
    }
}