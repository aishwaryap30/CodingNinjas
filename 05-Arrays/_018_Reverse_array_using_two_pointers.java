/*
     Program to print reverse of Array -
        -user will enter length of array 
        -array elements

     Approach- 
        using 2 pointers 
*/

import java.util.*;

public class _018_Reverse_array_using_two_pointers {

    public static void reverse(int[] arr) {

        int left = 0;
        int right = arr.length - 1;

        for (int i = 0; i < arr.length; i++) {

            while (left < right) {

                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;

                left++;
                right--;
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter capacity of array: ");
        int capacity = sc.nextInt();

        int arr[] = new int[capacity];

        for (int i = 0; i < capacity; i++) {
            System.out.print("Enter element at " + i + "index: ");
            arr[i] = sc.nextInt();
        }

        System.out.println();
        reverse(arr);

        System.out.print("Reversed array: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        sc.close();
    }
}
