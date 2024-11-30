/*
    Program to reverse sub array i.e You have to reverse array from given start index to end index.

*/

import java.util.*;

public class _015_Reverse_array_between_two_index {

    public static void reverse(int[] arr, int start, int end) {
        int s = start;
        int e = end;

        for (int i = 0; i < arr.length; i++) {

            while (s < e) {

                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;

                s++;
                e--;
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter capacity of Array: ");
        int capacity = sc.nextInt();

        int arr[] = new int[capacity];

        System.out.println();

        for (int i = 0; i < capacity; i++) {

            System.out.print("Enter element at " + i + "index: ");
            arr[i] = sc.nextInt();
        }
        System.out.println();

        System.out.print("Enter start index within array range: ");
        int start = sc.nextInt();

        System.out.print("Enter end index within array range: ");
        int end = sc.nextInt();

        reverse(arr, start, end);
        System.out.println();

        System.out.print("Reversed array: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }

        sc.close();

    }
}