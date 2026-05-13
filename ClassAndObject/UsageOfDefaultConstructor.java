package ClassAndObject;

class B1
{
	B1()
	{
		
	}
	
	int id;
	String name;
	float salary;
	boolean isMarried;
	


void display()
{
	System.out.println(id+"  "+name+"  "+salary+"  "+isMarried);
}

}

public class UsageOfDefaultConstructor {

	public static void main(String[] args) {
		
		B1 obj=new B1();
		obj.display();
		
		
		
		
		

	}

}
