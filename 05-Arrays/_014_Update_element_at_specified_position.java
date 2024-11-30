/*      Program to update an element in an array 
        - user will enter capacity 
        - array elements
        - new element to update
        - index where you want to update value 
        
  */

import java.util.*;

public class _014_Update_element_at_specified_position {

    // input method
    public static int takeinput(String str) {

        Scanner sc = new Scanner(System.in);

        System.out.print(str);

        int input = sc.nextInt();

        return input;

    }

    // update method
    public static void update_element(int[] arr, int capacity, int position, int update_ele) {
        for (int i = 0; i < capacity; i++) {

            if (i == position) {
                arr[i] = update_ele;
            }
        }
    }

    public static void main(String[] args) {

        int capacity = takeinput("Enter Capacity of array: ");
        System.out.println();

        int arr[] = new int[capacity];

        for (int i = 0; i < capacity; i++) {
            arr[i] = takeinput("Enter element at " + i + "index: ");
        }

        System.out.println();

        int position = takeinput("Enter position where you want to update ele: ");

        int update_ele = takeinput("Enter new value: ");

        update_element(arr, capacity, position, update_ele);

        for (int i : arr) {
            System.out.print(i + " ");
        }

    }

}
