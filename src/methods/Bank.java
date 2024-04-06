package methods;

public class Bank 
{

	public static void main(String[] args) 
	{
	System.out.println("main starts");
	dairymilk(10);
	munch(20);
	kitkat(50);//method calling statement
	eclairs(2);
	lollipop(5);
	}


public static void dairymilk( int price)//called method
{
	System.out.println("price of dairymilk :" +price);
}
public static void munch( int price)
{
	System.out.println("price of munch :" +price);
}
public static void kitkat (int price)
{
	System.out.println("price of kitkat :" +price);
}
public static void eclairs( int price)
{
	System.out.println("price of eclairs :" +price);
}
public static void lollipop (int price)
{
	System.out.println("price of lollipop :" +price);
}
}