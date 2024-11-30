/*  
     Program to print reverse of Array -
        -user will enter length of array 
        -array elements

     Approach- 
        creating extra array
        
*/

import java.util.*;

public class _016_Reverse_array_using_extra_array {

    public static void reverse(int[] arr) {

        int arr2[] = new int[arr.length];

        int j = arr.length;

        for (int i = 0; i < arr.length; i++) {
            arr2[j - 1] = arr[i];
            j = j - 1;
        }

        for (int i : arr2) {
            System.out.print(i + " ");
        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter capacity of array: ");
        int capacity = sc.nextInt();

        int arr[] = new int[capacity];

        for (int i = 0; i < capacity; i++) {

            System.out.print("Enter element at " + i + " index: ");
            arr[i] = sc.nextInt();
        }

        System.out.println();

        System.out.print("Reversed array: ");
        reverse(arr);

        sc.close();
    }
}
