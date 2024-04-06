package nonStaticMembers;

public class Nsv {
	int a=90; //non static variable
public static void main(String[] args)
{
	Nsv n=new Nsv();// wherever we create object there non static intilizer executes
	System.out.println("main starts");

	System.out.println(n.a);
	n.m1();
	Nsv n1=new Nsv();
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
