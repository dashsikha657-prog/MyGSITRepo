package AbstractionInjava;

abstract class B9
{
	
	
	void test()
	{
		System.out.println("I m test method");
	}
	static void display()
	{
		System.out.println("I m test method");
	}
	
	  abstract void message();
	
}

class B10 extends B9
{
	void message()
	{
		System.out.println("Java");
	}
	
	void demo()
	{
		System.out.println("Python");
	}
}

class B11 extends B9
{
	void message()
	{
		System.out.println("Java");
	}
	void demo()
	{
		System.out.println("Python");
	}
}





public class AbstractClassEx2 {

	public static void main(String[] args) {
		

	}

}
