package ClassAndObject;

class Diagram
{
	int rectangle(int l,int b)
	{
		return l*b;
	}
	
	float square(int x)
	{
		int s=x*x;
		//System.out.println(s);
		return s;
		
	}
	
	
}

public class ReturnType3 {

	public static void main(String[] args) {
		
		Diagram obj=new Diagram();
	System.out.println(obj.rectangle(12,30));	
	System.out.println (obj.square(8));
		

	}

}
