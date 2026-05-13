package InheritanceEx;

class I1
{
	void display()
	{
		System.out.println("Hello");
	}
}

class I2 extends I1
{
	
	void test()
	{
		System.out.println("Hi");
	}
}
public class SingleLevelInheritance {

	public static void main(String[] args) {
		
		I2 obj=new I2();
		obj.test();
		obj.display();
		
		
		
		
		
		
		
		
		
		

	}

}
