package InterfacePractice;

interface I8
{
	void display();
	
}
interface I9 extends I8
{
	void test();
	void display();
	
	
	
}



class C2 implements I9
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

public class InterfaceInheritance {

	public static void main(String[] args) {
		
		
		I9 ref=new C2();
		ref.display();
		ref.test();
		
		

	}

}
