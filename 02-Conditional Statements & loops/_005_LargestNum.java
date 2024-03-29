/* Write a program that takes three integers as input and prints the largest of the three numbers.*/

import java.util.*;

public class _005_LargestNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter num1");
        int a = sc.nextInt();

        System.out.println("Enter num2");
        int b = sc.nextInt();

        System.out.println("Enter num3");
        int c = sc.nextInt();

        int largest = a > b ? (a > c ? a : c) : (b > c ? b : c);
        System.out.println("Largest number is: " + largest);

        sc.close();

    }
}