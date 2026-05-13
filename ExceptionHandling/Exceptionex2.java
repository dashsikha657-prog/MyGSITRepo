package ExceptionHandling;

public class Exceptionex2 {

	public static void main(String[] args) {
		
		try
		{
		String str = null;//null pointer exception
		int x = str.length();
		System.out.println(x);
		}
		catch(NullPointerException e)//with only exception it consumes more memory but in this way it will only show the NullPointer memory
		{
			System.out.println("caught with   "+e.getMessage());
		}

		int a=20,b=30,c=40;//even this is a correct piece of code this wont run
		int res = a+b+c;
		System.out.println(res);//
	}

}
