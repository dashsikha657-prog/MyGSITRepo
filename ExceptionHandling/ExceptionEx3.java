package ExceptionHandling;

public class ExceptionEx3 {

	public static void main(String[] args) {
		
		try
		{
		int []arr= {78,90,67,56,44};
		System.out.println(arr[6]);//array out of bound exception
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("caught with   "+e.getMessage());
		}
		
		int a=20,b=30,c=40;//even this is a correct piece of code this wont run
		int res = a+b+c;
		System.out.println(res);//
		

	}

}
