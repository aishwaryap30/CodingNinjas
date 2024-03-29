
/* program to convert uppercase String to lowercase

*/
import java.util.*;

public class _003_UpperToLowerCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter String in Uppercase ");
        String uppercase = sc.nextLine();

        String lowercase = uppercase.toLowerCase();
        System.out.println("String in lowercase : "+ lowercase);

        sc.close();

    }
}