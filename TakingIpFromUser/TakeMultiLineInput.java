package TakingIpFromUser;

import java.util.Scanner;

public class TakeMultiLineInput {

	public static void main(String[] args) {
		
		System.out.println("Enter 3 lines");
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<3;i++)
		{
			String line=sc.nextLine();
			System.out.println("Input entered by you is  "+line);
			
		}
		
		sc.close();
		
		
		
		

	}

}
