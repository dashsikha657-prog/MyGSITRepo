//Positive, Negative, or Zero
//Write a program to check whether a number is positive, negative, or zero.

package LoopingProgramsAssignment;

import java.util.Scanner;

public class PositiveNegativeZero {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number   :");
		
		int num = sc.nextInt();
		
		if(num>0)
		{
			System.out.println("It is a Positive number");
		}
		else if(num<0) 
		{
			System.out.println("It is a Negative number");
		}
		else
		{
			System.out.println("Zero");
		}
		
		sc.close();

	}

}
