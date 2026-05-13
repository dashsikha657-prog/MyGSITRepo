package ThisKeywordAndPolymorphism;

class A35
{
	void display()
	{
		System.out.println("Hello");
	}
}

class A36 extends A35
{
	void display()
	{
		System.out.println("Hi");
	}



void show()
{
	this.display();
	super.display();
}

}




public class ThisSuperTogether2 {

	public static void main(String[] args) {
		
		A36 obj=new A36();
		obj.show();
	

	}

}
