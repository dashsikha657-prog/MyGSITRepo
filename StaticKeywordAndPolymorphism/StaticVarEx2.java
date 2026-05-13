package StaticKeywordAndPolymorphism;

class Shapes
{
	static double pi=3.14;
	
	 double circle(int r)
	{
		return pi*r*r;
	}
	 
	 double sphere(int r)
	 {
		 return (4*pi*r*r);
	 }
	
}



public class StaticVarEx2 {

	public static void main(String[] args) {
		
		Shapes obj=new Shapes();
		
	System.out.println(obj.circle(5));	
	
	System.out.println(obj.circle(10));
		
		
				
		
		
		

	}

}
