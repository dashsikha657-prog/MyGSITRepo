package StaticKeywordAndPolymorphism;

class Employees
{
	int id;
	String empName;
	static String comName="TCS";
	
	
	
	
	Employees(int i,String e)
	{
		id=i;
		empName=e;
		
	}
	
	 void change()
	{
		comName="CTS";
	}
	
	void display()
	{
		System.out.println(id+"  "+empName+"  "+comName);
	}
	
	
	
	}
public class StaticVariablesEx {

	public static void main(String[] args) {
		
		Employees obj=new Employees(1234,"Harry");
		obj.change();
		obj.display();
		
		Employees obj1=new Employees(6578,"Jerome");
		obj1.display();
		
		Employees obj2=new Employees(9875,"John");
		obj2.display();
		

	}

}
