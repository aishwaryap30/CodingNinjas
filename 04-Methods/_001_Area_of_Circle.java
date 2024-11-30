/*      

          Program to create method to calculate area of circle 
          
*/

import java.util.*;

public class _001_Area_of_Circle {

    public static double CalculateArea(int radius) {
        double pie = 3.14159;

        double area = pie * radius * radius;

        return area;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius: ");
        int radius = sc.nextInt();

        System.out.println("Area: " + CalculateArea(radius));

        sc.close();

    }
}