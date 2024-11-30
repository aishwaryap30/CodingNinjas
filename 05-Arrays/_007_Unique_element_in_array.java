/* 
        Program to find unique element in an array 
*/

public class _007_Unique_element_in_array {

    public static int findUnique(int[] arr) {

        for (int i = 0; i < arr.length; i++) {

            int j = 0;

            while (j < arr.length) {

                if (i != j && arr[i] == arr[j]) {
                    break;
                }
                j++;
            }

            if (j == arr.length) {
                return arr[i];
            }
        }
        return 0;

    }

    public static void main(String[] args) {

        int arr[] = { 2, 3, 1, 6, 3, 6, 2 };

        // printing array
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
  
        System.out.println("unique element: "+findUnique(arr));

    }
}