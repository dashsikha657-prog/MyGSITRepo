package StringPractise;

//A String object is immutable (cannot be changed once created).
//A StringBuffer object is mutable (can be changed) in the same place

public class StringBufferEx1 {

	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer("Harry");
		
		sb.append("Dsouza");
		
		System.out.println(sb);

	}

}