
/* Program to print sum of two numbers
*/
import java.util.Scanner;

public class _001_SumOfNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter num1");
        int num1 = sc.nextInt();
        System.out.println("Enter num2");
        int num2 = sc.nextInt();

        int sum = num1 + num2;
        System.out.println(sum);

        sc.close();

    }
}