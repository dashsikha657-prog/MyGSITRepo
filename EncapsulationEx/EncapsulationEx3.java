package EncapsulationEx;

class C41
{
	private int id;
	private String name;
	private double salary;
	
	
	public   void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
}


public class EncapsulationEx3 {

	public static void main(String[] args) {
		
		C41 obj=new C41();
		obj.setId(23);
		
		
		

	}

}
