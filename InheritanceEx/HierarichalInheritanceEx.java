package InheritanceEx;

class I6
{
	void display()
	{
		System.out.println("Hello");
	}
}

class I7 extends I6
{
	void test()
	{
		System.out.println("Hi");
	}
}

class I8 extends I6
{
	void msg()
	{
		System.out.println("How are");
	}
}

class I9 extends I6
{
	void show()
	{
		System.out.println("You :: welcome");
	}
}



public class HierarichalInheritanceEx {

	public static void main(String[] args) {
		
		I9 obj=new I9();
		obj.show();
		obj.display();
		
		
		
		
		

	}

}
