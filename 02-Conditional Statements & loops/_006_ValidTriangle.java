/*Given three positive integers as X, Y and Z representing three sides of a triangle,
 write a program that determines whether the triangle formed by the sides exist or not. 
 If the triangle exists, classify it as isosceles, scalene or equilateral.

Condition for valid Triangle:
Sum of any two of its sides should be greater than the third side */

import java.util.*;

public class _006_ValidTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter side1");
        int a = sc.nextInt();

        System.out.println("Enter side2");
        int b = sc.nextInt();

        System.out.println("Enter side3");
        int c = sc.nextInt();

        if (a + b > c && b + c > a && c + a > b) {
            if (a == b && b == c && c == a) {
                System.out.println("Equilateral Triangle");
            } else if (a == b || b == c || c == a) {
                System.out.println("Isosceles Triangle");
            } else if (a != b && b != c && c != a) {
                System.out.println("Scalene Triangle");
            }
        } else {
            System.out.println("invalid Triangle");
        }
        sc.close();
    }
}