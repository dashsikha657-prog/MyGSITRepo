package PolymorphismPractice;

class A26
{
	int add(int x,int y)
	{
		return x+y;
	}
	
	float add(int a,int b,int c)
	{
		return a+b+c;
	}
	
	double add(int a,int b,float c)
	{
		return a+a;
	}
}


public class PolymorphismEx1 {

	public static void main(String[] args) {
		
		A26 obj=new A26();
	System.out.println(obj.add(23, 67)); 
		
	System.out.println	(obj.add(12, 67, 93));
		
		
		

	}

}
