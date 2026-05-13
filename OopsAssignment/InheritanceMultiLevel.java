//Inheritance (Multilevel)
//Create three classes:
//Device â†’ method start()
//Mobile extends Device â†’ method calling()
//SmartPhone extends Mobile â†’ method internet()
//Create object of SmartPhone and call all methods.

package OopsAssignment;

class Device
{
	public void start()
	{
		System.out.println("Device is starting");
	}
}

class Mobile extends Device
{
	public void calling()
	{
		System.out.println("Mobile is Calling");
	}
}

class SmartPhone extends Mobile 
{

    public void internet() 
    {
        System.out.println("SmartPhone is accessing internet");
    }
}
public class InheritanceMultiLevel {

	public static void main(String[] args) {
		SmartPhone sp = new SmartPhone();
		sp.internet();
		sp.calling();
		sp.start();

	}

}
