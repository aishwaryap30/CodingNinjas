/*
     Program to print reverse array using collection class reverse method

     The method is to use the function java.util.Collections.reverse(List list) method. 
     
     This method reverses the elements in the specified list. Hence, we convert the array into a list 
     first by using java.util.Arrays.asList(array) and then reverse the list. 

*/

import java.util.*;

public class _017_Reverse_array_using_reverse_method {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Array Capacity: ");
        int capacity = sc.nextInt();

        Integer arr[] = new Integer[capacity];

        for (int i = 0; i < capacity; i++) {
            System.out.print("Enter element at " + i + " index: ");
            arr[i] = sc.nextInt();
        }

        Collections.reverse(Arrays.asList(arr));
        System.out.println(Arrays.asList(arr));

        sc.close();
    }

}

/*
 * 
 * Note- using ArrayList of Integers:
 * 
 * 
 * ArrayList<Integer> arrlst = new ArrayList<Integer>();
 * 
 * arrlst.add(2);
 * arrlst.add(3);
 * arrlst.add(4);
 * arrlst.add(5);
 * arrlst.add(6);
 * 
 * System.out.println("The initial list is :"+arrlst);
 * 
 * // reverse the list
 * Collections.reverse(arrlst);
 * 
 * System.out.println("The Reverse List is :"+arrlst);
 * 
 */
