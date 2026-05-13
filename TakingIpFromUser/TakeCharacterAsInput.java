package TakingIpFromUser;

import java.util.Scanner;

public class TakeCharacterAsInput {

	public static void main(String[] args) {
		
		System.out.println("Enter a character");
		
		Scanner sc=new Scanner(System.in);
		char ch=sc.next().charAt(1);
		
		
		System.out.println("Character at specific  index is  "+ch);
		

	}

}
