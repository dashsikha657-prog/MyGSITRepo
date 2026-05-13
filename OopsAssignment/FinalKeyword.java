//Final Keyword
//Create a class Bank with a final variable IFSC and final method showIFSC().
//Try creating a subclass HDFCBank and attempt overriding the final method (should show compile-time restriction).
//Create a main method to demonstrate usage.

package OopsAssignment;

class Bank
{
	final String IFSC = "HDFC00001234";
	
	public final void showIFSC() {
        System.out.println("IFSC Code: " + IFSC);
    }
}

class HDFC extends Bank
{
//	@Override
//    public void showIFSC() {
//        System.out.println("Trying to override");
//    }
}
public class FinalKeyword {

	public static void main(String[] args) {
		
		Bank b = new Bank();
		b.showIFSC();
		
		HDFC h = new HDFC();
		h.showIFSC();
	}

}
