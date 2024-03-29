
/* You are given a double "doubleValue". Your task is to write a Java program to perform the following operations:

1. You have to  Declare an integer variable "result" and Type cast the "doubleValue" to an integer  
2. Print the value of result .

*/
import java.util.*;

public class _004_TypeCast_DoubleToInt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter double value");
        double val = sc.nextDouble();
        int result = (int) val;

        System.out.println("Integer val: " + result);
        sc.close();

    }
}