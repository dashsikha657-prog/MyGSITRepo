//Static Concepts
//Create a class University with:
//static variable country = "India"
//instance variable universityName
//Print values using different objects to show static effect.


package OopsAssignment;

class University
{
	static String country = "India";
	String UniversityName;
	
	public void Display()
	{
		System.out.println("University Name:" + UniversityName);
		System.out.println("County Name:" + country);
	}
}
public class StaticObjects {

	public static void main(String[] args) {
	
		University u = new University();
		u.UniversityName = "Andhra University";
		
		University u1 = new University();
		u1.UniversityName = "Hyderabad University";
		
		u.Display();
		u1.Display();
		
		University.country = "USA";
		
		u.Display();
		u1.Display();

	}

}
