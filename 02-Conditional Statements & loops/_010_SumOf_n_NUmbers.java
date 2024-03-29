/* Given an integer n, find and print the sum of numbers from 1 to n*/

import java.util.*;

public class _010_SumOf_n_NUmbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        System.out.println("sum: " + sum);
        sc.close();

    }
}