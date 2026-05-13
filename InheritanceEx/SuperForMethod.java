package InheritanceEx;


class Mammal
{
	void eat()
	{
		System.out.println("Mammals eat");
	}
}
class Animal3 extends Mammal
{
	void eat()
	{
		System.out.println("Animal eats");
	}
	
	void sleep()
	{
		System.out.println("Animal sleeps");
	}
	
	void display()
	{
		eat();
		sleep();
		super.eat();
	}
}


class Dog3 extends Animal3
{
	void eat()
	{
		System.out.println("DOg eats");
	}
	
	void sleep()
	{
		System.out.println("Dog sleeps ");
	}
	
	void bark()
	{
		System.out.println("Dog barks");
	}
	
	void guard()
	{
		System.out.println("Dog guards the house");
	}
	
	 void test()
	{
		eat();
		sleep();
		bark();
		guard();
		super.eat();
		super.sleep();
		
		
	}
	
	
}
public class SuperForMethod {

	public static void main(String[] args) {
		
		Dog3 obj=new Dog3();
		obj.test();
		
		Animal3 obj1=new Animal3();
		obj1.display();
		
		
		

	}

}
