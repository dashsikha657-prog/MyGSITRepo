//Class + Object + Method
//Create a class Library with an instance variable libraryName.
//Create a default constructor to print "Welcome to the Library!".
//Create a method showLocation() which prints "This library is located in Mumbai".
//Create an object in main() and call both.

package OopsAssignment;

class Library
{
	String libraryName;
	
	Library()
	{
		System.out.println("Welcome to the Library!");
	}
	
	public void showLocation()
	{
		System.out.println("This library is located in Mumbai");
	}
}

public class ClassObjectMethod {

	public static void main(String[] args) {
		
		Library lb = new Library();
		lb.showLocation();

	}

}
