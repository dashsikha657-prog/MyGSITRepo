package LoopStatements;

public class PalindromeNumberEx {

	public static void main(String[] args) {
		
		int num = 321;
		
		int act = num;
		
		int rev = 0;
		
		while(num!=0)//32!=0//3!=0//0!=0
		{
			int d = num%10;//321%10=1//32%10=2//3%10=3
			
			rev = rev*10 + d;//0*10+1=1//1*10+2=12//12*10+3=123
			
			num = num/10;//321/10=32//32/10=3//3/10=0
			
		}
		
		System.out.println(rev);
		
		if(act==rev)
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("not palindrome");
		}
		
		}

}
