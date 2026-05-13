package PolymorphismPractice;

class Bank
{
	int getROI(int x,int y,int z)
	{
		return x+y+z;
	}
}

class SBI extends Bank
{
	int getROI(int x,int y,int z)
	{
		//super.getROI(x, y, z);
		return x+y+z;
	}
	
	
}

class HDFC extends Bank
{
	int getROI(int x,int y,int z)
	{
		return x+y+z;
	}
}

class Axis extends Bank
{
	int getROI(int x,int y,int z)
	{
		return x+y+z;
	}
}







public class MethodOverridingEx {

	public static void main(String[] args) {
		
		Bank obj=new Bank();
	System.out.println(obj.getROI(3, 5, 6));	
	
	
		

	}

}
