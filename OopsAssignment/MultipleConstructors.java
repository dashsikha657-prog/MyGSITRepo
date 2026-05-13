//WAP in Java to create a class named school 
//create name, address,strength as their instance variables 
//Create two constructor one with two variables and one with all the three variables 
//Create a method that will display all the three parameters 
//create two object of this class and call the respective methods 

package OopsAssignment;

class Schools
{
	String name;
	String address;
	int strength;
	
	Schools(String name, String address )
	{
		this.name=name;
		this.address=address;
	}
	
	Schools(String name, String address, int strength)
	{
		this(name,address);
		this.strength=strength;
	}
	
	public void Display()
	{
		System.out.println("School Name:" + name);
		System.out.println("Address:" + address);
		System.out.println("Strength:" + strength);
	}
}
public class MultipleConstructors {

	public static void main(String[] args) {
		
		Schools s = new Schools("VHS", "Vizag");
		s.Display();
		
		Schools s1 = new Schools("BTS", "Hyderabad", 90);
		s1.Display();
		
		

	}

}
