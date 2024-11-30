/*        Inserting element in an array    
             -user will enter Array capacity(length)
             -Array size(no. of ele present in array)
             -elements in array
             -new element to be inserted
             -position of element where you want to insert 

            note- when the new element is inserted in array the array must increase it's size it should not delete and insert new element . 
            As the new element inserted next other elements must shift to right.

            (here the capacity is empty to enter elements)

           ...*/

import java.util.*;

public class _012_Inserting_element_at_specified_Position {

    // method for taking input
    public static int takeinput(String str) {

        Scanner sc = new Scanner(System.in);

        System.out.print(str);

        int input = sc.nextInt();

        return input;

    }

    // method for inserting element
    public static int inserting_element(int[] arr, int position, int new_ele, int size) {

        for (int i = size; i > position; i--) {
            arr[i] = arr[i - 1];
        }

        arr[position] = new_ele;

        size++;
        return size;

    }

    public static void main(String[] args) {

        int capacity = takeinput("Enter the capacity of array : ");

        int size = takeinput("Enter size of array : ");

        int arr[] = new int[capacity];

        System.out.println();

        for (int i = 0; i < size; i++) {
            arr[i] = takeinput("Enter element at " + i + "index : ");
        }
        System.out.println();

        int new_ele = takeinput("Enter new element to be inserted : ");

        int position = takeinput("Enter the position ");

        inserting_element(arr, position, new_ele, size);

        System.out.println();
        for (int i : arr) {
            System.out.print(i + " ");
        }

    }
}
