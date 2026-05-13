//Hierarchical Inheritance
//Create a class Course with a method courseInfo().
//Create subclasses Science, Commerce, and Arts each with their own method.
//Create objects of each and call methods to show hierarchy.

package OopsAssignment;

class Course
{
	public void courseInfo()
	{
		System.out.println("you will get course information");
	}
}

class Science extends Course
{
	public void scienceInfo()
	{
		System.out.println("Science includes Physics,Chemistry,Biology");
	}
	
}

class Commerce extends Course
{
	public void commerceInfo()
	{
		System.out.println("Commerce includes accounting,Buisness Studies");
	}
	
}

class Arts extends Course
{
	public void artsInfo()
	{
		System.out.println("Arts includes History, Geography, Political Science");
	}
	
}
public class HierarchicalInheritance {

	public static void main(String[] args) {
		
		
		Science s = new Science();
		Commerce cm = new Commerce();
		Arts a = new Arts();
		
		s.courseInfo();
		s.scienceInfo();
		
		s.courseInfo();
		cm.commerceInfo();
		
		s.courseInfo();
		a.artsInfo();

	}

}
