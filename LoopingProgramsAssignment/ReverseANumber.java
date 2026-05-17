//Write a program using a while loop to reverse a number.
//Example:
//Input: 1234
//Output: 4321

package LoopingProgramsAssignment;

public class ReverseANumber {

	public static void main(String[] args) {
		
		int num = 1234;
		
		int reverse = 0;
		
		while(num!=0)
		{
			int d = num%10;
			reverse = reverse * 10 + d;
			num = num/10;
		}
        
		System.out.println("Reversed Number ="+ reverse);
	}

}
