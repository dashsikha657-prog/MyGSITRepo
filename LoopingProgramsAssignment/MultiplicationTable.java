//Multiplication Table
//Write a program to print the multiplication table of a number using a for loop.
//Example:
//Input: 4
//Output:
//4 x 1 = 4
//4 x 2 = 8
//...
//4 x 10 = 40

package LoopingProgramsAssignment;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number :");
		
		int num = sc.nextInt();
		
		for(int i=1;i<=10;i++)
		{
			System.out.println(num+ "x"+i+"="+(num*i));
		}

		sc.close();
	}

}
