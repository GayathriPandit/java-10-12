package demo;

public class Xyz 
{
	static int a=20;
	static 
	{
		byte b=(byte)a;
	}
	String name;
	int age;
	Xyz(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	static 
	{
		System.out.println(a);
	}
	public void printDetails()
	{
		System.out.println(name);
		System.out.println(age);
	}
	public static void main(String[] args) {
		Xyz x1=new Xyz("dinga",25);
		x1.printDetails();
	}

}
