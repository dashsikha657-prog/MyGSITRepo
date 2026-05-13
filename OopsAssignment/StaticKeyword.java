//Static Keyword
//Create a class Student having static variable collegeName and instance variables name and rollNo.
//Write a method to print both static and instance data.
//Create multiple objects to show static value remains constant.

package OopsAssignment;

class Students
{
	static String collegeName = "Osmania University";
	
	String name;
	int rollNo;
	
	 public void display()
	 
	   {
	        System.out.println("Name: " + name);
	        System.out.println("Roll No: " + rollNo);
	        System.out.println("College Name: " + collegeName);
	        System.out.println("----------------------");
	    }
	
}
public class StaticKeyword {

	public static void main(String[] args) {
		
		Students s = new Students();
		s.name = "Sikha";
		s.rollNo = 17;
		
		Students s1 = new Students();
		s1.name = "Subha";
		s1.rollNo = 20;
		
		s.display();
		s1.display();

	}

}
