package MyPkg1;

public class UnaryOperator2 {

	public static void main(String[] args) {
		
		int x=7;
		
		int y=8;
		
		int z=9;
		
		int r= ++z - --y + ++x  + x++ + y++ + z++ + ++x ;
		
		///   10 - 7 + 8 + 8 + 7 + 10
		
		
		/// z=10, y=7 ,x=8
		
		System.out.println(r);
		
		int k= 5;
		
		System.out.println(~k);
		
		boolean flag=true;
		
		System.out.println(!flag);
		
//		int p=10;
//		System.out.println(!p);
		
		

	}

}
