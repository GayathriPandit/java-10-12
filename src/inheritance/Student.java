package inheritance;

public class Student 
{
	int age;
	String name;
	int id;
	Student(String name)
	{
		this.name=name;
	}
	Student(String name, int id)
	{
		this.name=name;
		this.id=id;
	}
	Student(String name, int id, int age)
	{
		this.name=name;
		this.id=id;
		this.age=age;
	}
	public void display()
	{
		System.out.println("Name of student is" +name);
		System.out.println("Student id "+id);
		System.out.println("Student age is "+age);
	}

}
