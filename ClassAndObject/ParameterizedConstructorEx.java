package ClassAndObject;

class B3
{
	
	B3()
	{
		System.out.println("Hello");
	}
	
	
	int id;
	String name;
	float salary;
	boolean isMarried;
	
	 B3(int i,String n,float s,boolean m)
	{
		id=i;
		name=n;
		salary=s;
		isMarried=m;
	}
	 
	 void display()
	 {
		 System.out.println(id+"  "+name+"  "+salary+"  "+isMarried);
	 }
	 
	 void test()
	 {
		 System.out.println("Hello");
	 }
	 
	
	
}
public class ParameterizedConstructorEx {

	public static void main(String[] args) {
		
		B3 obj=new B3(1234,"Harry",90000f,false);
		B3 obj1=new B3(7865,"Tom",80000f,true);
		obj.display();
		//obj1.display();
		
		B3 obj2=new B3();
	//	obj2.test();
		
		
		
		

	}

}
