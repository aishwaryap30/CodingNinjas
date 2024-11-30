/* 
     You have been given an array/list and a number k. You have to find the kth smallest number.
*/

import java.util.*;

public class _005_Kth_Smallest_Number {

    public static int KthSmallest(int[] arr, int k) {

        for (int i = 0; i < arr.length - 1; i++) {

            for (int j = 0; j < arr.length - 1 - i; j++) {

                if (arr[j] >  arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr[k - 1];
    }

    public static void main(String[] args) {

        int arr[] = { 17, 5, 14, 16, 11, 18, 10 };

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter k (1-7): ");
        int k = sc.nextInt();

        System.out.println("Kth Smallest Number: " + KthSmallest(arr, k));

        sc.close();
    }
}