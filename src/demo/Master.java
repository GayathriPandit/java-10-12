package demo;

public class Master
{
	String state;
	int pincode;
	static int a=50;
	static
	{
		a=a++;
		a++;
		a=++a;
		a=a++;
	}
	{
		int a=45;
		System.out.println(a);
	}
	Master(String state,int pincode)
	{
		this.state=state;
		this.pincode=pincode;
	}
	static 
	{
		System.out.println(a);
	}
	{
		System.out.println(a);
	}
	public void printDetails()
	{
		System.out.println(state);
		System.out.println(pincode);
	}
}
