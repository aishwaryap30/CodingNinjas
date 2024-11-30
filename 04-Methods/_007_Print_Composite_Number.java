/* 
      Your task is to write a function named print_composite that prints if there are any composite numbers up to a given number, n.

     Composite numbers are positive integers greater than 1 ,
     that have more than two positive divisors. 
     In other words, a composite number has factors other than 1 and itself.
*/

import java.util.*;

public class _007_Print_Composite_Number {

    public static void print_composite(int num) {
        int flag, i, j;
        for (i = 2; i <= num; i++)

        {
            flag = 0;
            for (j = 2; j < i; j++) {
                if (i % j == 0)
                    flag++;
            }
            if (flag != 0)
                System.out.println(i);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter num: ");
        int num = sc.nextInt();

        print_composite(num);

        sc.close();
    }
}