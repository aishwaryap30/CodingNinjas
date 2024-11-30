/*    

     Sort the given unsorted array 'arr' in non-decreasing order using the selection sort algorithm.

*/

public class _006_Selection_Sort {

    public static void selectionSort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }

    public static void main(String[] args) {

        int arr[] = { 2, 13, 4, 1, 3, 6 };

        selectionSort(arr);

        System.out.println("Sorted Array: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}