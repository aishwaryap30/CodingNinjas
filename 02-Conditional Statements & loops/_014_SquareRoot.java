/* Given a number N, find its square root. You need to find and print only the integral part of square root of N.

For eg. if number given is 18, answer is 4.*/

//int root=(int)Math.sqrt(n);----inbuild method to find square root.

import java.util.*;

public class _014_SquareRoot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number to find Square root");
        int n = sc.nextInt();

        int squareRoot = 0;

        for (int i = 0; i * i <= n; i++) {
            squareRoot = i;
        }
        System.out.println("Square root: " + squareRoot);

        sc.close();

    }
}