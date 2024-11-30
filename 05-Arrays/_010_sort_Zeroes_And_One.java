/* 
          You have been given an integer array/list(ARR) of size N that contains only integers, 0 and 1. 
          Write a function to sort this array/list.
          Think of a solution which scans the array/list only once and don't require use of an extra array/list.

          Note:
          You need to change in the given array/list itself.
*/

public class _010_sort_Zeroes_And_One {

    public static void sortZeroesAndOne(int[] arr) {

        int nextZero = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == 0) {
                int temp = arr[nextZero];
                arr[nextZero] = arr[i];
                arr[i] = temp;
                nextZero += 1;
            }
        }
    }

    public static void main(String[] args) {

        int arr[] = { 0, 1, 1, 0, 1, 0, 1 };

        // printing array
        System.out.println("Given array");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();

        sortZeroesAndOne(arr);
        System.out.println("Sorted array");

        // printing sorted array
        for (int j : arr) {
            System.out.print(j + " ");
        }

    }
}
