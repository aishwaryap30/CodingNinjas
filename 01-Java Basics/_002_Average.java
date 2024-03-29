
/* program to find average of two numbers

*/
import java.util.*;

public class _002_Average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter num1");
        int num1 = sc.nextInt();
        System.out.println("Enter num2");
        int num2 = sc.nextInt();

        // internally converted to int so type cast to double to get float value

        double average = (double) (num1 + num2) / 2;
        System.out.println("Average is" + average);
        sc.close();

    }
}