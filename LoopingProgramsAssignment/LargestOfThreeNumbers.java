//Largest of Three Numbers
//Write a program to find the largest among three numbers using nested if-else.
//Example:
//Input: 10 25 15
//Output: 25 is largest


package LoopingProgramsAssignment;

public class LargestOfThreeNumbers {

	public static void main(String[] args) {
		
		int a=10,b=25,c=15;
		
		if(a>b)
		{
			if(a>c)
			{
				System.out.println("a is max");
			}
			else
			{
				System.out.println("c is max");
			}
		}
		if(b>c)
		{
			System.out.println("b is max");
		}
		else
		{
			System.out.println("c is max");
		}

	}

}
