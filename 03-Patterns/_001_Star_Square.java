
/* Print the following pattern for the given N number of rows.

Pattern for N = 3

***
***
***


*/
import java.util.*;

public class _001_Star_Square{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter n");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n; j++) {

                System.out.print("*");
            }
            System.out.println();
        }

        sc.close();
    }
}