package LoopStatements;

public class MaxBwThreeNumbers {

	public static void main(String[] args) {

       int a=12, b=55, c=20;
       
       if(a>b)
       {
    	  if(a>c)
    	  {
    		  System.out.println("a is max");
    	  }
    	  else
    	  {
    		  System.out.println("c is max");
    	  }
       }
       
       if(b>c)
       {
    	   System.out.println("b is max");
       }
       else
       {
    	   System.out.println("c is max");
       }

	}

}
