
/* Write a code which takes two integers as inputs and print their product .
Constraints:
1<= F1, F2 <= 100000

Sample Input 1:
123456789  123456789
Sample Output 1:
15241578750190521

*/
import java.util.*;

public class _006_MultiplyNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter num1");
        int num1 = sc.nextInt();

        System.out.println("Enter num1");
        int num2 = sc.nextInt();

        // the input size is very long it can't be stored in int so type cast to long.
        long result = (long) num1 * num2;
        System.out.println("Product: " + result);

        sc.close();

    }
}