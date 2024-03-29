/*Write a program to calculate the total salary of a person. 
The user has to enter the basic salary (an integer) and the grade (an uppercase character),
 depending upon which the total salary is calculated as:

    Total_salary = Basic + HRA + DA + Allow – PF
where :
HRA   = 20% of basic
DA    = 50% of basic
Allow = 1700 if grade = ‘A’
Allow = 1500 if grade = ‘B’
Allow = 1300 if grade = ‘C' or any other character
PF    = 11% of basic.
Round off the total salary and then print the integral part only. */

import java.util.*;

public class _008_TotalSalary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int allow;

        System.out.println("Enter Basic salary");
        int basic = sc.nextInt();

        System.out.println("Enter grade");
        char grade = sc.next().charAt(0);

        double hra = (0.2d * basic);
        double da = (0.5d * basic);
        if (grade == 'A') {
            allow = 1700;
        } else if (grade == 'B') {
            allow = 1500;
        } else {
            allow = 1300;
        }
        double pf = (0.11d * basic);
        double totalSalary = basic + hra;
        totalSalary += da;
        totalSalary += allow;
        totalSalary -= pf;

        System.out.println("Total salary: " + Math.round(totalSalary));

        sc.close();

    }
}