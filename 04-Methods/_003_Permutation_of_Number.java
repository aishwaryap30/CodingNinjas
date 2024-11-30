/*    
              program to calculate permutation(nPr) 
              
              formula: nPr= n!/(n-r):
*/

import java.util.*;

public class _003_Permutation_of_Number {

    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public static int permutation(int n, int r) {
        int factn = factorial(n);
        int factnr = factorial(n - r);

        int permutation = factn / factnr;
        return permutation;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        System.out.print("Enter r: ");
        int r = sc.nextInt();

        System.out.println("Permutation: " + permutation(n, r));

        sc.close();
    }
}