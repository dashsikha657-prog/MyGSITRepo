package ClassAndObject;

class B4
{
	int id;
	String name;
	float salary;
	boolean isMarried;
	
	B4(int i, String n)
	{
		id=i;
		name=n;
	}
	
	B4(int j,String m,float s)
	{
		id=j;
		name=m;
		salary=s;
	}
	
	 B4(int i,String n,float s,boolean m)
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
	
}



public class ParameterizedConstructor {

	public static void main(String[] args) {
		
		B4 obj=new B4(4567,"Tom",90000f,false);
		obj.display();
		B4 obj1=new B4(7655,"Harry");
		obj1.display();
		
		
		
		

	}

}
