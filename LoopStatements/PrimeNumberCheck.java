package LoopStatements;

import java.util.Scanner;

public class PrimeNumberCheck {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number ");
		
		int n=sc.nextInt();
		
		
		boolean isPrime=true;
		
		for(int i=2;i<=n/2;i++)//i=2,2<=2
		{
			if(n%i==0)//4%2==0
			{
				isPrime=false;
				break;
			}
			
			
		}
		
		System.out.println(isPrime? "Prime":"Not Prime");
		
		

	}

}
