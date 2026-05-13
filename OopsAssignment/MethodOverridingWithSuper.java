//Method Overriding with super
//Create a base class Hospital with a method emergencyService().
//Create a subclass CityHospital that overrides the method and calls parent method using super.emergencyService().
//Demonstrate overriding in main.

package OopsAssignment;

class Hospital
{
	public void emergencyService()
	{
		System.out.println("ER is for Emergency Services");
	}
}

class CityHospital extends Hospital
{
	public void emergencyService()
	{
		super.emergencyService();
		System.out.println("City Hospital is best for ER");
	}
	
}
public class MethodOverridingWithSuper {

	public static void main(String[] args) {
		
		Hospital h = new CityHospital();
		h.emergencyService();

	}

}
