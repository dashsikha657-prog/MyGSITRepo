package PolymorphismPractice;

final class Bird
{
	
	 void fly()
	{
		System.out.println("Birds fly");
	}
}

class Eagle extends Bird
{
	void fly()
	{
		System.out.println("eagles  fly");
	}
}

class vulture extends Eagle
{
	void fly()
	{
		System.out.println("vulture  fly");
	}
}


public class FinalClass {

	public static void main(String[] args) {
		
		
		

	}

}
