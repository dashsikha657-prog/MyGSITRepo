//Method Overloading
//Create a class Calculator with overloaded methods add():
//add(int a, int b)
//add(double a, double b)
//Call both methods inside the main method and print results.

package OopsAssignment;

class Calculator
{
	public int add(int a, int b)
	{
		return a+b;
	}
	
	public double add(double a, double b)
	{
		return a+b;
	}
}

public class MethodOverloading {

	public static void main(String[] args) {
		
		Calculator cl = new Calculator();
		System.out.println(cl.add(30, 77));
		System.out.println(cl.add(30000, 66000));

	}

}
