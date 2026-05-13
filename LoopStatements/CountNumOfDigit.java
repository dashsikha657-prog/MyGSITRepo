package LoopStatements;

public class CountNumOfDigit {

	public static void main(String[] args) {
		
		int num = 567;
		
		int count = 0;
		
		do
		{
			num = num/10;//567/10=56//num=56/10=5 //num=5/10=0
			count++;//0++=1//1++=2//2++=3
		}
		while(num!=0);//56!=0//5!=0//0!=0
		
		System.out.println("Number of Digits:"+count);

	}

}
