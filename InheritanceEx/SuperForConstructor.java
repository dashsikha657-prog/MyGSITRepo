package InheritanceEx;

class A14
{
	A14()
	{
		System.out.println("Parent constructor");
	}
}

class A15 extends A14
{
	
	
	A15()
	{
		super();
		System.out.println("Child constructor");
		
	}
	
	
}

public class SuperForConstructor {

	public static void main(String[] args) {
		
		A15 obj=new A15();
		
		

	}

}
