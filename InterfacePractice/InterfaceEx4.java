package InterfacePractice;

interface I10
{
	final static int y=20;
	
	abstract void run();
	abstract void show();
	
	
	 static  int sum(int x,int y)
	{
		return x+y;
	}
	
	static int sum(int x,int y,int z)
	{
		return x+y+z;
	}
}


class C10 implements I10
{
	public void run()
	{
		System.out.println("Hello");
	}
	
	public void show()
	{
		System.out.println("Hi");
	}
}


public class InterfaceEx4 {

	public static void main(String[] args) {
		
		I10 ref=new C10();
		ref.run();
		ref.show();
		
	System.out.println(I10.sum(20, 30));	
		
	System.out.println	(I10.sum(10, 20, 30));
		

	}

}
