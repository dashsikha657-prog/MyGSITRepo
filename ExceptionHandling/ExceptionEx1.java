package ExceptionHandling;
//exception is that event of a program which disruptes the normal flow of execution and can be handled by user.it is caused due to application issue
//checked and unchecked exception
//checked - run time exception - FilenotFound/IOexception/interruptable - these are handled by any IDE-eclipse VS code intellij
//unchecked - complite time exception -arithmetic,nullpointer,Illegal,Arraoutofbound- this is handle by us
public class ExceptionEx1 {

	public static void main(String[] args) {
	
		try
		{
		int x =9/0;
		System.out.println(x);//this is arithmetic exception
		}
		catch(ArithmeticException e)
		{
			System.out.println("caught with  "+e.getMessage());
		}
		
		int a=20,b=30,c=40;//even this is a correct piece of code this wont run
		int res = a+b+c;
		System.out.println(res);//

	}

}
