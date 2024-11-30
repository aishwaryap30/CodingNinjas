/* 
     Sort an array using Bubble Sort
        
*/

public class _004_Bubble_sort {

    public static void bubbleSort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {

            for (int j = 0; j < arr.length - 1 - i; j++) {

                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 2, 13, 4, 1, 3, 6, 28 };

        bubbleSort(arr);
        
        System.out.println("Sorted array: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
}}
