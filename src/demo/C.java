package demo;

public class C 
{
	static int a;
	static
	{
		int a=10;
		m1();
	}
	public static void m1()
	{
		a=20;
		
	}
	public static void main(String[] args)
	{
		m1();
		System.out.println(C.a);
		System.out.println(a);
	}
}
