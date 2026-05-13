package StringPractise;

public class StringBufferReverse {

	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder("Java");
		sb.reverse();
		
		System.out.println(sb);

	}

}
//default capacity of Stringbuilder is 16 bits.

//StringBuffer is Thread-safe(synchronous)
//StringBuilder is non-Thread safe(asynchronous)

//means for example if we have a printer then person 1 is sending 10 requests and person 2 is sending 10 requests 
//in non-thread safe the while 1st is in progress if the second requests comes the request will be routed to second request.
//here the execution is fast but there can be a deadlock

//in thread safe if the 1st request is in progress it will wait for it to complete then only it will go and pick up 
//the second request.so the disadvantage is execution is slow but the work will be finished on time.