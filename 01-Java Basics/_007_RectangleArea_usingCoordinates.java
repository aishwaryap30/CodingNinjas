
/* You are given a rectangle in a plane whose sides are parallel to the axes. The coordinates of one of its diagonals are provided to you. 
You have to print the total area of the rectangle.

The coordinates of the rectangle are provided as four integral values: x1, y1, x2, y2. It is given that x1 < x2 and y1 < y2.

*/
import java.util.*;

public class _007_RectangleArea_usingCoordinates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter x1 coordinate:");
        int x1 = sc.nextInt();

        System.out.println("Enter x2 coordinate:");
        int x2 = sc.nextInt();

        System.out.println("Enter y1 coordinate:");
        int y1 = sc.nextInt();

        System.out.println("Enter y2 coordinate:");
        int y2 = sc.nextInt();

        int area = (x2 - x1) * (y2 - y1);
        System.out.println("Area: " + area);

        sc.close();

    }
}