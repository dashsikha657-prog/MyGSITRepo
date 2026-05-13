
//Create an abstract class Animal with an abstract method sound().
//Create two subclasses Dog and Cat and provide implementation for sound() method.
//Create objects and call sound() for each.

package OopsAssignment;

abstract class Animal
{
	abstract void Sound();
}

class Dog extends Animal
{

	void Sound() 
	{
		System.out.println("Dog barks");
		
	}
	
}

class Cat extends Animal
{
	void Sound()
	{
		System.out.println("Cat Meows");
	}
}

public class Abstraction {

	public static void main(String[] args) {
		
		Dog d = new Dog();
		Cat c = new Cat();
		
		d.Sound();
		c.Sound();

	}

}
