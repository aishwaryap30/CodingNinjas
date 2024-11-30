/* 
      Binary Search 
        - The list/array must be sorted.
    
*/

import java.util.*;

public class _002_Binary_search {

    public static int BinarySearch(int arr[], int target) {

        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {

            int mid = (left + right) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (target < arr[mid]) {
                right = mid - 1;
            } else if (target > arr[mid]) {
                left = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 };

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter element to be searched: ");
        int target = sc.nextInt();

        int result = BinarySearch(arr, target);

        if (result == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Found at index: " + result);
        }

        sc.close();
    }
}
