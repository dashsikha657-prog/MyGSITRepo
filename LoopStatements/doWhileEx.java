package LoopStatements;
//do while is called exit control loop
public class doWhileEx {

	public static void main(String[] args) {
		
		int i = 10;
		
		do
		{
			System.out.println(i);//0//1//2//3
			i++;//0++//1++//2++//3++
		}
		while(i<4);	//1<4//2<4//3<4//4<4

	}

}



//even the i=10 and 10<4 is false still the condition will execute once. output will be 10