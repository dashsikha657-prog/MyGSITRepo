//Polymorphism (Runtime + Upcasting)
//Create a class Camera with a method capture().
//Create a subclass DSLCamera that overrides the method.
//Use parent reference to call child object method (dynamic polymorphism).

package OopsAssignment;

class Camera
{
	public void capture()
	{
		System.out.println("this camera captures good pictures");
	}
}

class DSLRCamera extends Camera
{
	public void capture()
	{
		
		System.out.println("DSLR has more high definition pictures");
	}
}
public class PolymorphismRuntimeUpcasting {

	public static void main(String[] args) {
		
		Camera c1 = new DSLRCamera();
		c1.capture();

	}

}
