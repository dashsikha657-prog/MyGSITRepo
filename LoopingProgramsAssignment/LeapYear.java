//Leap Year Program
//Write a program to check whether a year is a leap year or not.
//Hint:
//A leap year is divisible by 4 but not by 100 unless divisible by 400.

package LoopingProgramsAssignment;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		
		        Scanner sc = new Scanner(System.in);

		        System.out.print("Enter a year: \n");
		        int year = sc.nextInt();

		        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) //
		        {
		            System.out.println(year + " is a Leap Year");
		        } 
		        else 
		        {
		            System.out.println(year + " is not a Leap Year");
		        }

		        sc.close();
		    }
		

	}


