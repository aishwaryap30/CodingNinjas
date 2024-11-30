/* 
          Program to find minimum element in an array and return that.
*/

import java.util.*;

public class _003_Minimum_element_in_an_array {

    public static int minimum_element(int[] arr) {
        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length of array: ");
        int capacity = sc.nextInt();

        int arr[] = new int[capacity];

        for (int i = 0; i < capacity; i++) {

            System.out.print("Enter element at " + i + " index: ");
            arr[i] = sc.nextInt();
        }
        
        System.out.println();
        
        System.out.println("Minimum element in an array: " + minimum_element(arr));

        sc.close();
    }
}