/* You are tasked with creating a program for a bank that determines whether a person is eligible for a loan. The eligibility criteria for the loan are as follows:

Conditions :
The person must be at least 18 years old.
The person must have a monthly income of at least $2,000.
The person must not have any outstanding loans with the bank.
 */

import java.util.*;

public class _007_LoanEligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter age");
        int age = sc.nextInt();

        System.out.println("Enter income");
        double income = sc.nextDouble();

        System.out.println("Enter 'true' if you have any outstanding loans else enter 'false'");
        boolean outstanding_loan = sc.nextBoolean();

        if (outstanding_loan == false && age >= 18 && income >= 2000.0) {
            System.out.println("You are eligible for the loan.");
        }

        else {
            System.out.println("You are not eligible for the loan.");
        }
        sc.close();

    }
}