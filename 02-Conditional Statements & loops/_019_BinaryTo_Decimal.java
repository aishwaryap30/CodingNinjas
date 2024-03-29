/* Given a binary number as an integer N, convert it into decimal and print.*/

import java.util.*;

public class _019_BinaryTo_Decimal {

    static int BinaryTo_Decimal(int n) {
        int num = n;
        int dec_value = 0;
        int temp = n;
        int base = 1;
        while (temp > 0) {
            int last_digit = temp % 10;
            temp = temp / 10;
            dec_value += last_digit * base;
            base = base * 2;
        }
        return dec_value;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Binary Number:");
        int num = sc.nextInt();

        System.out.println("Decimal Number is: " + BinaryTo_Decimal(num));
        sc.close();
    }
}