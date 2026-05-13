package InterfacePractice;

interface I4
{
	void display();
	int sum(int x,int y);
	
	
}

class B2 implements I4
{
	B2()
	{
		System.out.println("I am defualt constructor");
	}
	
	public void display()
	{
		System.out.println("Hello");
	}
	
	public int sum(int x,int y)
	{
		return x+y;
	}
}





public class InterfaceEx2 {

	public static void main(String[] args) {
		
		I4 ref=new B2();
		ref.display();
	System.out.println(ref.sum(34, 76));	
		
		

	}

}
