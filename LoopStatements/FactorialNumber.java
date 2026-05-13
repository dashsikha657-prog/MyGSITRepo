package LoopStatements;

public class FactorialNumber {

	public static void main(String[] args) {
		
		int n=9;
		
		int fact = 1;
		
		int i=1;
		
		do
		{
			fact=fact*i;//1*1=1//1*2=2//2*3=6//6*4=24//24*5=120
			i++;//1++//2++//3++//4++
		}
        while(i<=n);//2<=5//3<=5//4<=5//5<=5
		
		System.out.println("Factorial of number:"+ fact);
	}

}
