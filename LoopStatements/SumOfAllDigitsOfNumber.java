package LoopStatements;

public class SumOfAllDigitsOfNumber {

	public static void main(String[] args) {
		
		int num = 557677;
		
		int sum = 0;
		
		while(num!=0)//32!=0//3!=0//0!=0
		{
			int d = num%10;//321%10=1//32%10=2//3%10=3
			sum = sum+d;//0+1=1//1+2=3//3+3=6
			num = num/10;//321/10=32//32/10=3//3/10=0
	
		}
		
		System.out.println("Sum of all numbers:"+ sum);
	}

}
