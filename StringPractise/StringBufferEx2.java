package StringPractise;

public class StringBufferEx2 {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("I love tea");
		sb.replace(7, 11, "chai");
		
		System.out.println(sb);

	}

}
