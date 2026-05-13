package ThisKeywordAndPolymorphism;

class A28
{
	int x=10;
}

class A29 extends A28
{
	int x=30;
	void show()
	{
		System.out.println(this.x);
		System.out.println(super.x);
	}
}

public class ThisAndSuperTogether {

	public static void main(String[] args) {
		
		A29 obj=new A29();
		obj.show();
		

	}

}
