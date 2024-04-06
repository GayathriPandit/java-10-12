package inheritance;

public class Chocolate
{
	String name = "kitkat";
	int price=50;
	Chocolate(){}
	Chocolate(String name, int price)
	{
		this.name=name;
		this.price=price;
				
	}
	public void chocolateDetails()
	{
		System.out.println(name);
		System.out.println(price);
	}
	public String toString()
	{
		return "name : " +name + "price : " + price;
	}
}
