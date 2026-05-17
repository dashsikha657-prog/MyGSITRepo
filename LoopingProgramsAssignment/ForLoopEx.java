//Write a program using a for loop to print numbers from 1 to N.
//Example:
//Input: 5
//Output: 1 2 3 4 5


package LoopingProgramsAssignment;

import java.util.Scanner;

public class ForLoopEx {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number  :");
		int n=sc.nextInt();
		
		for(int i=1;i<=n;i++)//1<=5//2<=5//3<=5//4<=5//5<=5
		{
			System.out.println(i+ " ");//1//2//3//4//5
		}
        sc.close();
	}

}
