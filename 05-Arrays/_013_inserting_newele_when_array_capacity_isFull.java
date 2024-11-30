/*
       Inserting element in an array    
             -user will enter Array capacity(length)
             -elements in array
             -new element to be inserted
             -position of element where you want to insert 

            note- Here the capacity of array is full, when you want to insert a new element you have to increase the capacity of array.
                  As the new element inserted next other elements must shift to right.

*/

import java.util.*;

public class _013_inserting_newele_when_array_capacity_isFull {

    // input method
    public static int takeinput(String str) {

        Scanner sc = new Scanner(System.in);

        System.out.print(str);

        int input = sc.nextInt();

        return input;
    }

    // inserting method
    public static void insert_element(int[] arr2, int newCapacity, int position, int new_ele) {

        for (int i = arr2.length - 1; i > position; i--) {

            arr2[i] = arr2[i - 1];
        }
        arr2[position] = new_ele;

    }

    public static void main(String[] args) {

        int capacity = takeinput("Enter length of array: ");
        int arr[] = new int[capacity];

        System.out.println();

        for (int i = 0; i < capacity; i++) {
            arr[i] = takeinput("Enter element at " + i + "index: ");
        }

        System.out.println();

        int newCapacity = takeinput("Enter new capacity to insert a ele: ");

        int arr2[] = new int[newCapacity];

        // copying value from arr1 to arr2
        for (int i = 0; i < arr.length; i++) {
            arr2[i] = arr[i];
        }

        int position = takeinput("Enter position to insert new ele: ");

        int new_ele = takeinput("Enter new element to insert: ");

        System.out.println();

        insert_element(arr2, newCapacity, position, new_ele); // method call

        System.out.print("old array: "); // printing old array
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.print("new array: "); // printing new array
        for (int i : arr2) {
            System.out.print(i + " ");
        }
    }
}
