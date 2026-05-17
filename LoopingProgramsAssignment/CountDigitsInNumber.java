package LoopingProgramsAssignment;

public class CountDigitsInNumber {

	public static void main(String[] args) {
		
		int num = 1234;
		
		int count =0;
		
		while(num!=0)
		{
			num=num/10;//1234/10=123//123/10=12/12/10=1//1/10=1
			count++;//0++=1//1++=2/2++=3//4
			
		}
        
		System.out.println("num of digits :"+ count);
	}

}
