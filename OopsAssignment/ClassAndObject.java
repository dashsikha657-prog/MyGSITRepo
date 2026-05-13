//WAP in Java 
//Create a Class named Shape with length as instance variable  , create three methods as square , rectangle , circle 
//and find out their respective areas 
//Create a object in main method and call these different methods with the instance of object 

package OopsAssignment;

class Shapes
{
	double length;
	double breadth;
	double pi = 3.14;
	
	public void Square()
	{
		double area = length * length;
		System.out.println("Area of Square:" + area);
	}
	
	public void Rectange()
	{
		double area = length * breadth;
		System.out.println("Area of rectangle:" + area);
	}
	
	public void Circle()
	{
		double area = pi * length * length;
		System.out.println("Area of Circle:" + area);
	}
}
public class ClassAndObject {

	public static void main(String[] args) {
		
		Shapes s = new Shapes();
		s.length = 5;
		s.breadth = 6;
		
		s.Square();
		s.Rectange();
		s.Circle();

	}

}
