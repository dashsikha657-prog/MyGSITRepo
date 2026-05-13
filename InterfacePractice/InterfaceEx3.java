package InterfacePractice;

interface I5
{
	void volume();
	void area();
	void tsa();
	static void display()
	{
		System.out.println("Hi");
	}
}

class Sphere implements I5
{
	public void volume()
	{
		System.out.println(" Spehere Volume calculated");
	}
	
	public void area()
	{
		System.out.println(" Spehere Area calculated");
	}
	
	public void tsa()
	{
		System.out.println("Spehere tsa calculated");
	}
}

class Cyllinder implements I5
{
	public void volume()
	{
		System.out.println("Cyllinder Volume calculated");
	}
	
	public void area()
	{
		System.out.println("Cyllinder Area calculated");
	}
	
	public void tsa()
	{
		System.out.println("Cyllinder tsa calculated");
	}
}






public class InterfaceEx3 {

	public static void main(String[] args) {
		
		I5 ref=new Sphere();
		ref.volume();
		ref.tsa();
		ref.area();
		
		I5 ref1=new Cyllinder();
		ref1.volume();
		ref1.tsa();
		ref1.area();
		
		I5.display();
		

	}

}
