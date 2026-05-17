package LoopingProgramsAssignment;

public class PatternPrinting {

	public static void main(String[] args) {
		
		for(int i=5;i>=1;i--)//i=5,5>=1//4>=1
		{
			for(int j=1;j<=i;j++)//j=1,1<=4//2<=4
			{
				System.out.print(" *");
			}
			
			System.out.println();
		}
		

	}

}
