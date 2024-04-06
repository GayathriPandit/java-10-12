package nonStaticMembers;

public class Admin {
	int a=90; //non static variable	
	public static void main(String[] args)
	{
	  System.out.println("main starts");
	  Admin x=new Admin();
	  System.out.println(x.a);
	  x.m1();
	  System.out.println("main ends");
	}
	public void m1()
	{
		System.out.println("m1 is executing");
	}
	{
		System.out.println("non static intializer is executing");
	}

}
