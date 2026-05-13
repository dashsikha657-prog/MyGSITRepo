//1.Encapsulation + Getter/Setter
//
//WAP in Java
//Create a class named Employee with private instance variables empId, empName, and salary.
//Provide public getters and setters for all variables.
//Create a method displayDetails() to print employee details.
//Create an object in the main method and assign values using setters then display them.


package OopsAssignment;

class Employee
{
	private int empId;
	private String empName;
	private double salary;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public void Displaydetails()
	{
		System.out.println("Employee ID:" + empId);
		System.out.println("Employee Name: " + empName);
        System.out.println("Salary: " + salary);
	}
}

public class EncapsulationGetterSetter {

	public static void main(String[] args) {
		
		Employee emp = new Employee();
		emp.setEmpId(17);
		emp.setEmpName("Sikha");
		emp.setSalary(90000.0);
		
		emp.Displaydetails();

	}

}
