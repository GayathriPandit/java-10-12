package nonStaticMembers;

public class Book1 
{
	String name;
	int price;
	int bid;
	
	Book1()
	{}
	
	Book1(String name, int price, int bid )
	{
		this.name=name;
		this.price=price;
		this.bid=bid;
	}
	
	public void book1Details()
	{
		System.out.println(name);
		System.out.println(price);
		System.out.println(bid);
	}
	

}
