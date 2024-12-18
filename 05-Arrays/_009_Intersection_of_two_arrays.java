/* 
       You have been given two integer arrays/list(ARR1 and ARR2) of size N and M, respectively.
        You need to print their intersection; An intersection for this problem can be defined 
        when both the arrays/lists contain a particular value or to put it in other words, 
        when there is a common value that exists in both the arrays/lists.

    Note :
      Input arrays/lists can contain duplicate elements.

      The intersection elements printed would be in the order they appear in the first array/list(ARR1)
*/

public class _009_Intersection_of_two_arrays {

    public static void intersections(int arr1[], int arr2[]) {
        for (int i = 0; i < arr1.length; i++) {

            for (int j = 0; j < arr2.length; j++) {

                if (arr1[i] == arr2[j]) {

                    System.out.print(arr1[i] + " ");
                    arr2[j] = Integer.MIN_VALUE;
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {

        int arr1[] = { 2, 6, 1, 2 };

        int arr2[] = { 1, 2, 3, 4, 2 };

        // printing array1
        for (int i : arr1) {
            System.out.print(i + " ");
        }
        System.out.println();


        // printing array2
        for (int j : arr2) {
            System.out.print(j + " ");
        }
        System.out.println();

        
        intersections(arr1, arr2);

    }
}
