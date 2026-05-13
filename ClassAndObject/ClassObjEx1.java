package ClassAndObject;

public class ClassObjEx1 {
	
	void display()
	{
		System.out.println("test");
	}
	
	void sum()
	{
		int a=20,b=30;
		int c=a+b;
		System.out.println(c);
	}
	
	public static void main(String[] args) {
		
		ClassObjEx1 obj=new ClassObjEx1();
		obj.display();
		obj.sum();
		

	}

}
