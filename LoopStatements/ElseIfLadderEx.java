package LoopStatements;

public class ElseIfLadderEx {

	public static void main(String[] args) {
		
		int a=20,b=300,c=40,d=600;
		
        if(a>b && a>c && a>d)
        {
        	System.out.println("a is max");
        }
        else if(b>a && b>c && b>d)
        {
        	System.out.println("b is max");
        }
        else if(c>a && c>b && c>d)
        {
        	System.out.println("c is max");
        }
        else
        {
        	System.out.println("d is max");
        }
		

	}

}
