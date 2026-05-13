package LoopStatements;

public class BreakStatementEx {

	public static void main(String[] args) {
		
		for(int i=0;i<=10;i++)//i=2,2<=5//i=3,3<=5//i=4,4<=5
		{
			if(i==4)
			{
				continue;
			}
			
			System.out.println(i);//2//3
		}
		
		

	}

}
