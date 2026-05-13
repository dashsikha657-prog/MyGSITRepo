//Create an interface Payment with a method makePayment().
//Create two classes UPI and CreditCard implementing this interface and define their own payment messages.
//Call the method through interface reference.

package OopsAssignment;

interface Payment
{
	void makePayment();
	
}

class UPI implements Payment
{
	public void makePayment()
	{
		System.out.println("payment is done using UPI");
	}
}

class CreditCard implements Payment
{
	public void makePayment()
	{
		System.out.println("payment is done using credit card");
	}
}

public class InterfaceImplementation {

	public static void main(String[] args) {
		
		Payment p1 = new UPI();
		p1.makePayment();
		
		Payment p2 = new CreditCard();
		p2.makePayment();

	}

}
