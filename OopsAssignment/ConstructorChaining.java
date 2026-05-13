//Constructor Chaining
//Create a class Mall with:
//Default constructor printing "Welcome to the Mall"
//Parameterized constructor calling default constructor using this()
//Demonstrate constructor chaining in main.

package OopsAssignment;

class Mall
{
	Mall()
	{
		System.out.println("Welcome to the Mall");
	}


	Mall(String MallName)
	{
		
		this();
		System.out.println("Mall Name:"+ MallName);
	}
}
public class ConstructorChaining {

	public static void main(String[] args) 
	{
		Mall m = new Mall("Inorbit");
		
		
	}

}
