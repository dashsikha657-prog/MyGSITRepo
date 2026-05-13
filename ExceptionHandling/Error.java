package ExceptionHandling;

//Error which is something user cannot handle and doesnt know how to recover from that.it is unrecoverable.it is caused by system issues jvm issues
//is caused by mostly system failure which we cannot recover
//is part of java.lang.error which is under java.lang.throwable
//both error and exception come under java.lang.throwable

public class Error {

	public static void main(String[] args) {
		
		main(args);//this stack overflow error as we are calling main inside main

	}

}
