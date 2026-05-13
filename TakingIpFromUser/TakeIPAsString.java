package TakingIpFromUser;

import java.util.Scanner;

public class TakeIPAsString {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String value");
		
		String str= sc.nextLine();
		int x=str.length();
		
		System.out.println("Length of String is  "+x);
		
		
		
		

	}

}

