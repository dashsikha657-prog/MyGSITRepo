package AbstractionInjava;

abstract class Employee
{
	void displayName()
	{
		System.out.println("Employee name is Harry");
	}
	
	void empId()
	{
		System.out.println("Id is 12345");
	}
	
	
	
	abstract void salary();
	
}

class Salary extends Employee
{

	
	void salary() 
	{
		System.out.println("Salary is 80000");
		
	}
	
}


public class AbstractClassOverview {

	public static void main(String[] args) {
		
		Salary obj=new Salary();
		obj.salary();
		obj.empId();
		obj.displayName();
		

	}

}
