package ThisKeywordAndPolymorphism;

class Student
{
	int roll;
	String name;
	int grade;
	String spec;
	
	Student(int roll,String name,int grade)
	{
		this.roll=roll;
		this.name=name;
		this.grade=grade;
	}
	
	Student(int roll,String name,int grade,String spec)
	{
		this(roll,name,grade);
		this.spec=spec;
	}
	
	
	void display()
	{
		System.out.println(roll+"  "+name+"  "+grade+"  "+spec);
	}
	
	
	
	
}
public class ThisForReusingConstructor {

	public static void main(String[] args) {
		
		Student obj=new Student(1234,"Rohan",5,"science");
		obj.display();
		
		Student obj1=new Student(9876,"Sohan",6);
		obj1.display();
		

	}

}
