/*     
       Linear search 
         - Search for an element in an array
         - traverse through each element in array 
           
*/

import java.util.*;

public class _001_Linear_Search {

    public static int LinearSearch(int[] arr, int n) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        int arr[] = { 2, 9, 7, 8, 5, 15, 20, 23, 26, 31, 30, 10, 3, 40, 50, 99, 56, 78, 82 };

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter element to be searched: ");
        int n = sc.nextInt();

        int result = LinearSearch(arr, n);

        if (result == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Found at index: " + result);
        }

        sc.close();
    }
}