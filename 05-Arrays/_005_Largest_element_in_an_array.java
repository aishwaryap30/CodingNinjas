/* 
        program to find Largest element in an array 

*/

import java.util.*;

public class _005_Largest_element_in_an_array {

    static int largestElement(int[] arr) {
        int largest_Element = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest_Element) {
                largest_Element = arr[i];
            }
        }
        return largest_Element;
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

        System.out.println("Largest element in an array: " + largestElement(arr));
        sc.close();
    }
}