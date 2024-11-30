/* 
     Program to search an element in an array 
      - user will enter element to be searched

    note- The array is already created ,the program will return index of element if present otherwise print -1 if element not found */

import java.util.*;

public class _019_Search_element_in_array {

    // search method
    public static int search(int[] arr, int search_ele) {

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == search_ele) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int arr[] = { 34, 56, 78, 89, 66, 55, 2, 5, 9, 3, 22, 20, 50, 100, 55, 90, 80, 8, 15, 12, 75 };

        System.out.print("Enter element to be searched: ");
        int search_ele = sc.nextInt();

        System.out.print("Element found at index: " + search(arr, search_ele));

        sc.close();
    }
}