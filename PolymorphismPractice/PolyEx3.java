package PolymorphismPractice;

class A30
{
	static int add(int x,int y)
	{
		return x+y;
	}
	
	static int add(int x,int y,int z)
	{
		return x+y+z;
	}
	
	
	
}


public class PolyEx3 {

	public static void main(String[] args) {
		
	System.out.println(A30.add(34, 78));	
	
	System.out.println(A30.add(34, 98,112));
		
	}

}
