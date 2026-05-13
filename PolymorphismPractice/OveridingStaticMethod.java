package PolymorphismPractice;

class A33
{
	static int add(int x,int y)
	{
		return x+y;
	}
}

class A34 extends A33
{
	static int add(int x,int y)
	{
		return x+y;
	}
}


public class OveridingStaticMethod {

	public static void main(String[] args) {
		
	System.out.println(A34.add(34, 89));	
	
	System.out.println(A33.add(67, 99));
		
		
	}

}
