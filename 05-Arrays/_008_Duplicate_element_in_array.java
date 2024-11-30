/* 
      Program to find duplicate element in an array
*/

public class _008_Duplicate_element_in_array {

    public static int find_Duplicate(int[] arr) {

        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] == arr[j]) {

                    return arr[i];
                }
            }
        }
        return 0;

    }

    public static void main(String[] args) {

        int arr[] = { 2, 3, 1, 6, 5, 9, 2 };

        // printing array
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.print("Duplicate element: " + find_Duplicate(arr));

    }
}