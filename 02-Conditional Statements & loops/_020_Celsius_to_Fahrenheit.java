/* Given three values - Start Fahrenheit Value (S), End Fahrenheit value (E) and Step Size (W), 
you need to convert all Fahrenheit values from Start to End at the gap of W, 
into their corresponding Celsius values and print the table.

Sample Input 1:
0 
100 
20
Sample Output 1:
0   -17
20  -6
40  4
60  15
80  26
100 37*/

import java.util.*;

public class _020_Celsius_to_Fahrenheit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Start Fahrenhiet value");
        int fahrenhiet = sc.nextInt();

        System.out.println("end Fahrenhiet value");
        int end_fahrenhiet = sc.nextInt();

        System.out.println("gap b/w Fahrenhiet values");
        int gap = sc.nextInt();
        System.out.println("Fahrenhiet value:    celsius value:    ");

        while (fahrenhiet <= end_fahrenhiet) {
            int celsius = (fahrenhiet - 32) * 5 / 9;

            System.out.println(fahrenhiet + "                    " + celsius);
            fahrenhiet += gap;
        }

        sc.close();

    }
}