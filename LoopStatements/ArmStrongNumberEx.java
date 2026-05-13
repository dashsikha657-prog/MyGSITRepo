package LoopStatements;

public class ArmStrongNumberEx {

	public static void main(String[] args) {
		
		int num = 153;
		
		int t=num;
		
		int sum=0;
		
		while(num!=0)
		{
			int d=num%10;
			
			sum = sum+d*d*d;
			
			num = num/10;
			
			
		}
		
		if(sum==t)
		{
		System.out.println("Armstrong number");
		
		}
		else
		{
			System.out.println("not Armstrong num");
		}
	}

}
