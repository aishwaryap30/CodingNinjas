/* Write a program for a theme park that categorizes visitors into four groups: infants, children, adults, and seniors, based on their age.
 The program should print a message indicating the category the visitor falls into.

Categorize the visitor based on the following age groups:
Infants: Age 0 to 4 
Children: Age 5 to 12 
Adults: Age 13 to 64
Seniors: Age 65 and above*/

import java.util.*;

public class _002_ThemePark {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Age");
        int age = sc.nextInt();

        if (age < 5) {
            System.out.println("Infants");
        } else if (age < 13) {
            System.out.println("Children");
        } else if (age < 65) {
            System.out.println("Adults");
        } else {
            System.out.println("Seniors");
        }
        sc.close();

    }
}