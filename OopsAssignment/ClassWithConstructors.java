//WAP in Java 
//Create a class named school ,create name as their instance variables 
//Create a default constructor of this class which will have a print statement to display the name of school 
//Create a method inside the class which will display a message as "This School is based out of Kolkata"
//Create a object under main method and call the constructor and the method 

package OopsAssignment;

class School
{
	String schoolName;
	
	School()
	{
		schoolName = "DPS";
		System.out.println("Name of the School:" +schoolName);
	}
	
	public void Display()
	{
		System.out.println("This School is based out of Kolkata");
	}
}
public class ClassWithConstructors {

	public static void main(String[] args) {
		
		School s = new School();
		
		s.Display();
		

	}

}
