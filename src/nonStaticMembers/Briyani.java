package nonStaticMembers;

public class Briyani
{
	String type;
	int price;
	String color;
	Briyani()//default constructor
	{}
	Briyani (String type, int price, String color)//parameterized constructor
	{
		this.type=type;
		this.price=price;
		this.color=color;
				
	}
	public void briyaniDetails()
	{
		System.out.println(type);
		System.out.println(price);
		System.out.println(color);
	}
}
