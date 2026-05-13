package InheritanceEx;





class Animal
{
	String colour="random";
	String property="bark";
}

class Dog extends Animal
{
	String colour="black";
	
	void display()
	{
		System.out.println(property);
		System.out.println(colour);
		System.out.println(super.colour);
		
		
	}
	
}

public class SuperKeywordEx1 {

	public static void main(String[] args) {
		
		Dog obj=new Dog();
		obj.display();
		
		
		

	}

}
