//Sum of First N Natural Numbers
//Write a program using a while loop to calculate the sum of first N natural numbers.
//Example:
//Input: 5
//Output: 15

package LoopingProgramsAssignment;

import java.util.Scanner;

public class NaturalNumbers {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("First N   :");
		
		int n=sc.nextInt();
		
		int sum = 0;
		
		int i=1;
		
		while(i<=n)
		{
			sum = sum+i;
			i++;
		}
		
		System.out.println("Sum = "+sum);
		sc.close();

	}

}
