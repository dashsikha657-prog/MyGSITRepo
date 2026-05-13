package InheritanceEx;


class Mammals 
{
	String colour="red";
}

class Animal2 extends Mammals
{
	String colour="random";
	String property="bark";
}

class Dog2 extends Animal2
{
	String colour="black";
	
	void display()
	{
		System.out.println(colour);
		System.out.println(super.colour);
		System.out.println(super.property);
		
	}
	
}

public class SuperKeyWordEx2 {

	public static void main(String[] args) {
		
		Dog2 obj=new Dog2();
		obj.display();
		

	}

}
