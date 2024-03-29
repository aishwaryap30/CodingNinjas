/* Write a program that generates a multiplication table for a given integer.*/

import java.util.*;

public class _009_TableOf_GivenNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number to print table");
        int num = sc.nextInt();

        System.out.println("Table of: " + num);
        for (int i = 1; i <= 10; i++) {
            System.out.println(num * i);
        }

        sc.close();

    }
}