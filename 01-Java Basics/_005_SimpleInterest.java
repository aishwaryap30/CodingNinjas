
/* Take the principal amount, rate of interest, and the time period as input and calculate the Simple Interest.

Note: Print the answer as integer value.

*/
import java.util.*;

public class _005_SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter principal amount");
        float principal = sc.nextFloat();

        System.out.println("Enter rate");
        float rate = sc.nextFloat();

        System.out.println("Enter time");
        float time = sc.nextFloat();

        int interest = (int) (principal * rate * time) / 100;

        System.out.println("simple Interest:  " + interest);
        sc.close();
    }
}