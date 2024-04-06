package demo;

public class First_C
{
	public void myMethod()
	{
		System.out.println("method");
		
	}
	{
		System.out.println("instance block");
	}
	public void First_C()
	{
		System.out.println("constructor");
	}
	static 
	{
		System.out.println("static block");
	}
	public static void main(String[] args) {
		First_C c=new First_C();
		c.myMethod();
	}

}
