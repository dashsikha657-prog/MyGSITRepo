package ThisKeywordAndPolymorphism;

class A21
{
	int id;
	String name;
	boolean isMarried;
	
	A21(int id,String name,boolean isMarried)
	{
		this.id=id;
		this.name=name;
		this.isMarried=isMarried;
	}
	
	void display()
	{
		System.out.println(id+"  "+name+"  "+isMarried);
	}
	
	
}


public class ThisKeyWordIntro {

	public static void main(String[] args) {
		
		A21 obj=new A21(1234,"Harry",true);
		obj.display();
		
		
		
		

	}

}
