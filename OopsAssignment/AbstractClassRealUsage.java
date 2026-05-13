//Abstract Class + Real Usage
//Create an abstract class Employee with:
//abstract method: calculateSalary()
//concrete method: employeeDetails()
//Subclass FullTimeEmployee and PartTimeEmployee implementing salary calculation logic differently.


package OopsAssignment;

abstract class Employeess
{
	abstract void calculateSalary();
	
	public void employeeDetails()
	{
		System.out.println("Employee details will be displayed here:");
	}
}

class FullTimeEmployee extends Employeess
{
	void calculateSalary() 
	{
        double monthlySalary = 50000;
        System.out.println("Full-Time Employee Salary: " + monthlySalary);
    }
}

class PartTimeEmployee extends Employeess 
{
        void calculateSalary() 
        {
        	
        int hoursWorked = 4;
        int hourlyRate = 500;
        double salary = hoursWorked * hourlyRate;
        System.out.println("Part-Time Employee Salary: " + salary);
        
        }
}
public class AbstractClassRealUsage {

	public static void main(String[] args) {
		
		 Employeess e1 = new FullTimeEmployee();
	     Employeess e2 = new PartTimeEmployee();

	        
	        e1.employeeDetails();
	        e1.calculateSalary();

	        e2.employeeDetails();
	        e2.calculateSalary();

	}

}
