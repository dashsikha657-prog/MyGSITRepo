package AbstractionInjava;

abstract class B5
{
    abstract void msg();
	abstract void test();
	
	void demo()
	{
		System.out.println("Hello");
	}
	
	void display()
	{
		System.out.println("Hi");
	}
}


class B6 extends B5
{
	void msg()
	{
		System.out.println("Welcome");
		
	}
	void test()
	{
		System.out.println("Java");
	}
}



class AbstractClassEx3 {

	public static void main(String[] args) {
		
		B6 obj=new B6();
		obj.msg();
		obj.display();
		obj.demo();
		obj.test();
		
		
		

	}

}
