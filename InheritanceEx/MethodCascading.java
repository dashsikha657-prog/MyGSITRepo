package InheritanceEx;

class A13
{
	void display()
	{
		System.out.println("Welcome");
	}
	
	void run()
	{
		System.out.println("Hello");
	}
	
	void test()
	{
		System.out.println("Hi");
	}
	
	void message()
	{
		display();
		run();
		test();
	}
	
	
	
	
	
}





public class MethodCascading {

	public static void main(String[] args) {
		
		A13 obj=new A13();
		obj.message();
		
		
		

	}

}
