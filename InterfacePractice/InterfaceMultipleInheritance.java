package InterfacePractice;

interface I6
{
	void display();
}

interface I7
{
	void test();
}

class C5 implements I6,I7
{
	public void display()
	{
		System.out.println("Hello");
	}
	
	public void test()
	{
		System.out.println("Hi");
	}
	
	
}



public class InterfaceMultipleInheritance {

	public static void main(String[] args) {
		
		C5 obj=new C5();
		obj.display();
		obj.test();
		

	}

}
