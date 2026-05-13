package PolymorphismPractice;

class B1
{
	 final int a=20;
	 final int b=40;
	
	void display()
	{
		a=30;
		System.out.println(a);
	}
	
}

final class B2 extends B1
{
	
}

public class FinalKeyWordEx {

	public static void main(String[] args) {
		
		B1 obj=new B1();
		obj.display();
		

	}

}
