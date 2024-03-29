/*Given a number N, print sum of all even numbers from 1 to N. */

import java.util.*;

public class _011_SumOf_EvenNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter n");
        int n=sc.nextInt();
		int sum=0;
		for(int i=0;i<=n;i=i+2){
			sum=sum+i;

		}
		System.out.println("sum: "+sum);

        sc.close();

	}    

}
