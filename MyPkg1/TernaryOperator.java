package MyPkg1;

public class TernaryOperator {

	public static void main(String[] args) {
		
//		int a=10;
//		int b=30;
//		
//		int max= a>b ?a:b; /// 10>30 ?10:30
//		
//		System.out.println(max);
		
		
		int a=15,b=15,c=30;
		
		int max= (a>b) ? (a>c?a:c) : (b>c?b:c);
		
		/// (15>30) (15>30?15:30)
		
		System.out.println(max);
		

	}

}
