package ClassAndObject;

class A3
{
	
	
	void display(int a,int b)
	{
		int c=a+b;
		System.out.println("Sum of two numbers are  "+c);
		
	}
}

public class MethodsWithArg {

	public static void main(String[] args) {
		
		A3 obj=new A3();
		obj.display(30, 20);
		
		
		

	}

}
