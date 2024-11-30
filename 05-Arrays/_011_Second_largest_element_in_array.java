/*

    You have been given a random integer array/list(ARR) of size N.
     You are required to find and return the second largest element present in the array/list.


 */


 
public class _011_Second_largest_element_in_array {

    public static int secondLargestElement(int[] arr) {
        int max1 = arr[0];
        int max2 = max1;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > max1) {
                max2 = max1;
                max1 = arr[i];
            } else if (arr[i] > max2) {
                max2  = arr[i]; 
            }
        }
        return max2;
    }

    public static void main(String[] args) {

        int arr[] = {13, 6, 31, 14, 29, 44, 3};

        // printing array
        System.out.println("Given array");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("Second largest element: " + secondLargestElement(arr));

    }
}