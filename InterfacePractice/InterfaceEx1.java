package InterfacePractice;

interface I3
{
	 void display();
	 int x=20;
	 void test();
	 
}

class C1 implements I3
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
public class InterfaceEx1 {

	public static void main(String[] args) {
		
		I3 ref=new C1();
		ref.display();
		ref.test();
		
		
		System.out.println(I3.x);
		
		

	}

}
