package InheritanceEx;

class I3
{
	void msg()
	{
		System.out.println("Hello");
	}
}

class I4 extends I3
{
	void show()
	{
		System.out.println("Hi");
	}
	
	
	
}

class I5 extends I4
{
	
	void test()
	{
		System.out.println("Welcome");
	}
}



public class MultiLevelInheritance {

	public static void main(String[] args) {
		
		I5 obj=new I5();
		
		obj.test();
		obj.show();
		obj.msg();
		
		
		
		

	}

}
