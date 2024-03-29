/* Write a program that asks the user for a number N and a choice C. 
And then give them the possibility to choose between computing the sum and computing the product of all integers
 in the range 1 to N (both inclusive).

*/

import java.util.*;

public class _015_SumOrProduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number");
        int n = sc.nextInt();

        System.out.println("Enter choice:  1.sum   2.product");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                int sum = 0;
                for (int i = 1; i <= n; i++) {
                    sum = sum + i;
                }
                System.out.println("sum: " + sum);
                break;

            case 2:
                int product = 1;
                for (int j = 1; j <= n; j++) {
                    product = product * j;
                }
                System.out.println("Product: " + product);
                break;

            default:
                System.out.println("-1");
                break;
        }
        sc.close();

    }
}