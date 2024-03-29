/* Write a program that takes a number as input and prints all its factors except 1 and the number itself..
 If the number has only two factors (1 and the number itself), then the program should print -1.*/

import java.util.*;

public class _016_PrintAll_Factors {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to find Factors");
        int n = sc.nextInt();

        int count = 0;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
                count += 1;
            }
        }
        if (count == 0) {
            System.out.println("-1");

        }
        sc.close();
    }
}