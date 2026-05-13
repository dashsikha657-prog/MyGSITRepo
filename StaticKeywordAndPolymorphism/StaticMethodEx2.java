package StaticKeywordAndPolymorphism;

class Calculation
{
	static int add(int x,int y)
	{
		return x+y;
	}
	
	static float subtract(int a,int b)
	{
		return a-b;
	}
}



public class StaticMethodEx2 {

	public static void main(String[] args) {
		
	System.out.println(Calculation.add(12, 56));	
	
	System.out.println	(Calculation.subtract(34, 13));
		

	}

}
