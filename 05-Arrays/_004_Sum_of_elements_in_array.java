/*  
       Program to find sum of all elements of array
*/

public class _004_Sum_of_elements_in_array {

    public static void main(String[] args) {

        int arr[] = { 12, 45, 67, 4, 8, 33, 22 };

        for (int i : arr) {
            System.out.print(i + " ");
        }

        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        System.out.println();

        System.out.println("Sum: " +sum);

    }
}