/*    

      You have a list of numbers that are not in order.
      You want to find the sum of the differences between the indices
      of pairs of numbers that are in the wrong order.
      A pair of numbers is considered to be in the wrong order 
      if the smaller number comes after the larger number in the list.
      
      When we apply selection sort, first swap will happen between array[0] to array[4], 
      inversion will be (index of arrar[4]-index of array[0]) = 4-0=4
       and the array after this will be [1, 2, 11, 5, 3], still the array is not sorted. 
       So we will apply selection sort again, the swap will now take place between array[2] and array[4], 
       inversion will be 4+(index of arrar[4]-index of array[2])=4+(4-2)=4+2=6.
       So the final sorted array now will be [1,2,3,5,11]
*/

public class _007_Inversions_using_SelectionSort {

    public static int getInversions(int[] arr) {
        int sum = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length ; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            sum += min - i;
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
        return sum;
    }

    public static void main(String[] args) {

        int arr[] = { 17, 5, 14, 16, 11, 18, 10 };

        System.out.print("Inversion: " + getInversions(arr));

    }
}