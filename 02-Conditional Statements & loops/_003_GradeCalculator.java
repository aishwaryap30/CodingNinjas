/*Your program should take an integer input representing the numerical score and output the corresponding grade. 
If the input score is not within the valid range (0-100), the program should display "Invalid score".

Instructions :
The grading system is as follows:
A: 90-100
B: 80-89
C: 70-79
D: 60-69
F: 0-59 */

import java.util.*;

public class _003_GradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Score:");
        int score = sc.nextInt();

        if (score <= 100) {
            if (score >= 90 && score <= 100) {
                System.out.println("Grade-A");
            } else if (score >= 80 && score < 90) {
                System.out.println("Grade-B");
            } else if (score >= 70 && score < 80) {
                System.out.println("Grade-C");
            } else if (score >= 60 && score < 70) {
                System.out.println("Grade-D");
            } else if (score >= 0 && score < 60) {
                System.out.println("Grade -F");
            }
        } else {
            System.out.print("Invalid score");
        }
        sc.close();

    }
}