package MyPkg1;

public class UnaryOperators {

	public static void main(String[] args) {
		
		int a=5;
		
		int b=6;
		
		int c= ++b  - --a  + ++a - --b;
		
		///    7 - 4 + 5 - 6
		
		// b=7,a=5
		
		System.out.println(c);
		
		
		

	}

}
