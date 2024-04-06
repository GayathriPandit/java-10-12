package nonStaticMembers;

public class Student 
{
	String name;
	int id;
	int marks;
	
	Student()
	{}
	Student(String name, int id,int marks)
	{
		this.name=name;
		this.id=id;
		this.marks=marks;
	}
	public void studentDetails()
	{
		System.out.println(name);
		System.out.println(id);
		System.out.println(marks);
	}
}
