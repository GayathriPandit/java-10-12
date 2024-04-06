package inheritance;

public class Demo 
{
	String bname;
	int bid;
	Demo(String bname,int bid)
	{
		this.bname=bname;
		this.bid=bid;
	}
	public String toString()
	{
		return "bname is " + bname + " " +"bid is " +bid;
	}
	public static void main(String[] args) {
		Demo d= new Demo("java",123);
		System.out.println(d);
	}

}
