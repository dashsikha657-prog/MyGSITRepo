package ThisKeywordAndPolymorphism;

class A26
{
	static int a;
	static int b;
	
	 A26(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
	 
	 static void show()
	 {
		 System.out.println(a+"  "+b);
	 }
}


public class ThisStaticTogether {

	public static void main(String[] args) {
		
		
		A26 obj=new A26(23,67);
		obj.show();
		
		

	}

}
