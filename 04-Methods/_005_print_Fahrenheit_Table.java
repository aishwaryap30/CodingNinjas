/*
      Given three values - Start Fahrenheit Value (S), End Fahrenheit value (E) and Step Size (W), 
      you need to convert all Fahrenheit values from Start to End at the gap of W, 
      into their corresponding Celsius values and print the table.

      formula: C = (F - 32) * 5/9
              
*/

import java.util.*;

public class _005_print_Fahrenheit_Table {

    public static void printFahrenheitTable(int start, int end, int step) {
        
        while (start <= end) {
            int celsius = (int) (start - 32) * 5 / 9;
            System.out.print(start + "\t" + celsius);
            System.out.println();
            start = start + step;

        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter start: ");
        int start = sc.nextInt();

        System.out.print("Enter end: ");
        int end = sc.nextInt();

        System.out.print("Enter step: ");
        int step = sc.nextInt();

        printFahrenheitTable(start, end, step);

        sc.close();
    }
}