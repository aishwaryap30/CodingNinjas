/* Write a program to find x to the power n (i.e. x^n). Take x and n from the user. You need to print the answer.

Note : For this question, you can assume that 0 raised to the power of 0 is 1

inbuilt method-
       if(x==0 && n==0){
           System.out.println("1");

       }
       else{
             System.out.println((int)Math.pow(x,n));
       }
*/

import java.util.*;

public class _017_x_to_the_power_n {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter base");
        int x = sc.nextInt();

        System.out.println("Enter power");
        int n = sc.nextInt();

        if (x == 0 && n == 0) {
            System.out.println("1");
        } else {
            int result = power(x, n);
            System.out.println("result: " + result);
        }
        sc.close();
    }

    public static int power(int x, int n) {
        if (n == 0)
            return 1;

        int result = x;
        for (int i = 1; i < n; i++) {
            result *= x;
        }
        return result;
    }

}
