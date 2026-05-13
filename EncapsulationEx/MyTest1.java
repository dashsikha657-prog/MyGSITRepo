package EncapsulationEx;

class C45
{
	private int id;
	private String name;
	private double salary;
	
	public int getId() 
	{
		return id;
	}
	public void setId(int id) 
	{
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
	
	
	
}


public class MyTest1 {

	public static void main(String[] args) {
		
		C45 obj=new C45();
		obj.setSalary(78000);
		System.out.println(obj.getSalary());
		
		obj.setName("Harry");
		System.out.println(obj.getName());
		
		obj.setId(7865);
		System.out.println(obj.getId());
		
		
		
		

	}

}
