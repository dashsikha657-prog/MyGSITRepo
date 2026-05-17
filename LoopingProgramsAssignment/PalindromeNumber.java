package LoopingProgramsAssignment;

public class PalindromeNumber {

	public static void main(String[] args) {
		
		int num = 121;
		
		int p=num;
		
		int reverse = 0;
		
		while(num!=0)
		{
			int d = num%10;
			reverse = reverse *10 +d;
			num = num/10;
		}
		System.out.println(reverse);
		
		if(p==reverse)
		{
			System.out.println("It is a palindrome");
		}
		else
		{
			System.out.println("Not a palindrome");
		}

	}

}
