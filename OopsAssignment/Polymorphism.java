//Polymorphism (Dynamic Binding)
//Create a parent class Shape with a method area().
//Create subclasses Rectangle and Circle and override the area() method.
//Create a reference of Shape and assign objects of both subclasses one by one, calling area() each time.

package OopsAssignment;

class Shape
{
	double pi = 3.14;
	public void area()
	{
		System.out.println("Area Calculation");
	}
}

class rectangle extends Shape
{
	public void area() 
	{
        int length = 10;
        int width = 5;
        System.out.println("Area of Rectangle: " + (length * width));
    }
}

class circle extends Shape
{
	public void area()
	{
		double radius = 7;
		System.out.println("Area of Circle: "+ (pi * radius * radius));
	}
}
public class Polymorphism {

	public static void main(String[] args) {
		
		Shape s = new rectangle();
		s.area();
		
		Shape s1 = new circle();
		s1.area();

	}

}
