package LoopingProgramsAssignment;

import java.util.Scanner;

public class MenuDriverCalculatorProgram {

	public static void main(String[] args) {
		
		int choice;
		Scanner sc = new Scanner(System.in);
		
		do
		{
			System.out.println("******------Claculator------*****");
			System.out.println("1- Addition");
			System.out.println("2- Substraction");
			System.out.println("3- Multiplication");
			System.out.println("4- Division");
			System.out.println("5- Exit");
			System.out.println("Enter your Choice");
			choice=sc.nextInt();
			
			if(choice>=1 && choice<=4)
			{
				System.out.println("Enter the first number");
				double a=sc.nextDouble();
				System.out.println("Enter the second number");
				double b = sc.nextDouble();
				
				switch(choice)
				{
				case 1:
					System.out.println("the result is  "+(a+b));
					break;
				
			    case 2:
				    System.out.println("the result is  "+(a-b));
				    break;
			    
		        case 3:
			        System.out.println("the result is  "+(a*b));
			        break;
			        
		        case 4:
					System.out.println("the result is  "+(a/b));
					break;
					
				default:
					System.out.println("entered a invalid choice");
					
				}
			}
				
			}
		    while(choice!=5);
		

	}

}
