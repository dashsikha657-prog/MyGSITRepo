//Interface with Multiple Implementations
//Create an interface Transport with method booking().
//Implement it in Bus and Flight classes.
//Call using interface reference.

package OopsAssignment;

interface Transport
{
	void booking();
}

class Bus implements Transport
{
	public void booking()
	{
		System.out.println("Bus is booked using Red Bus app");
	}
}

class Flight implements Transport
{
	public void booking()
	{
		System.out.println("Flight is booked using yatra app");
	}
}
public class InterfaceWithMultipleImplementation {

	public static void main(String[] args) {
		
		Transport t = new Bus();
		t.booking();
		
		Transport t1 = new Flight();
		t1.booking();

	}

}
