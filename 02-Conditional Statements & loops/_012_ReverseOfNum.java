/*Write a program to generate the reverse of a given number N. Print the corresponding reverse number.

Note : If a number has trailing zeros, then its reverse will not include them. 
For e.g., reverse of 10400 will be 401 instead of 00401. */

import java.util.*;

public class _012_ReverseOfNum {
    static int revers(int n) {
        int rn = 0;
        while (n > 0) {
            rn = rn * 10 + n % 10;
            n = n / 10;
        }
        return rn;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number to reverse");
        int n = sc.nextInt();
        System.out.println("Reversed num: " + revers(n));

        sc.close();

    }
}