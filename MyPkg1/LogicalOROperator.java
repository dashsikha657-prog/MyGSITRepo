package MyPkg1;

public class LogicalOROperator {

	public static void main(String[] args) {
		
		
		int x=10;
		int y=20/2;
		int z=30/4;
		
		
		if(x<=y || z>=x || y<=z)  /// 10>=10, 
		{
			System.out.println("Correct");
		}
		else
		{
			System.out.println("Incorrect");
		}
		
		

	}

}
