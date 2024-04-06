package demo;

public class LocalVar {
 static int s=6; //static variable
	public static void main(String[] args) 
	{
	 System.out.println("main starts");
	 int m=90; //local variable
	 System.out.println(m);
	 
	 System.out.println(s);
	 System.out.println("main ends");

	}
	public static void hari()
	{
		int h = 45;
		System.out.println(h);
		System.out.println(s);
		
	}
 
}
