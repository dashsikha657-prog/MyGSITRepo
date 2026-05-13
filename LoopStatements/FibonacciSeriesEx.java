package LoopStatements;

public class FibonacciSeriesEx {

	public static void main(String[] args) {
		
		int n1=0;
		int n2=1;
		
		System.out.println("fibonacci series is    \n");
		
		System.out.print(n1+" "+n2);
		
		for(int i=2;i<10;i++)//2<5//3<5//4<5
		{
			int n3=n1+n2;//0+1=1//1+1=2//1+2=3
			System.out.print("  "+n3);//1//2//3
			n1=n2;//1//1//2
			n2=n3;//1//2//3
		}
		
		
		
	}

}
