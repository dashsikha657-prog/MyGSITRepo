package LoopStatements;

public class PatternPrinitingEx1 {

	public static void main(String[] args) {
		
		for(int i=1;i<=10;i++)//i=1,1<=5//i=2,2<=5//i=3,3<=5
		{
			for(int j=1;j<=i;j++)//j=1,1<=3
			{
				System.out.print("* ");///*
			}
			
			System.out.println();
		}
		

	}

}
