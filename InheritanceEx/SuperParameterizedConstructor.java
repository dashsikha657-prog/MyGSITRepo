package InheritanceEx;

class A16
{
	A16(int z,int k,int p)
	{
		System.out.println(z+" "+k+" "+p);
	}
	
	A16(int x,int y)
	{
		System.out.println(x+"  "+y);
	}
}

class A17 extends A16
{
	A17(int x,int y)
	{
		super(10,20,80);
		
		System.out.println(x+"  "+y);
	}
}



public class SuperParameterizedConstructor {

	public static void main(String[] args) {
		
		A17 obj=new A17(34,45);
		
		
		
		

	}

}
