package InterfacePractice;

interface I12
{
	default void start()
	{
		System.out.println("Hello");
	}
	
	default void show()
	{
		System.out.println("Hi");
	}
	
	default void run()
	{
		start();
		show();
	}
	
	
}



class C13 implements I12
{
	C13()
	{
		System.out.println("Python");
	}
}





public class DefaultMethodInterface {

	public static void main(String[] args) {
		
		I12 ref=new C13();
		ref.run();
		
		

	}

}
