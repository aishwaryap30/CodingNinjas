/* 
      Program to calculate Simple Interest

      formula:  Simple interest=Principal*rate*time/100 

*/

import java.util.*;

public class _006_Calculate_Simple_Interest {

    public static int calculateSimple(int principal, double rate, int time) {

        int simple_interest = (int) (principal * rate * time / 100);
        return simple_interest;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Principal: ");
        int principal = sc.nextInt();

        System.out.print("Enter Rate: ");
        double rate = sc.nextDouble();

        System.out.print("Enter Time: ");
        int time = sc.nextInt();

        System.out.println("Simple Interest: "+calculateSimple(principal, rate, time));
        

        sc.close();
    }
}