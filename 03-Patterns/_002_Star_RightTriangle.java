
/*
Star pattern program

* 
* * 
* * * 
* * * * 
* * * * * 
* * * * * * 
* * * * * * * 

*/
import java.util.*;

public class _002_Star_RightTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {

                System.out.print("*");
            }
            System.out.println();
        }

        sc.close();
    }
}