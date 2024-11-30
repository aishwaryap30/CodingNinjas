/* 
     Program to Swap elements of array, i.e each element swapped to its adjacent element.
     eg
     Sample Input :
               9 3 6 12 4 32

     Sample Output :
               3 9 12 6 32 4
*/

import java.util.*;

public class _006_Swap_elements_of_array {

    public static void swapAlternate(int arr[]) {
        int temp = 0, n = arr.length;
        for (int i = 0; i < n - 1; i += 2) {
            temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }
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

        for (int i : arr) {
            System.out.print(i+" ");
        }

        System.out.println();
        swapAlternate(arr);

        System.out.println("Swapped array: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }

        sc.close();
    }
}