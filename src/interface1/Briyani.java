package interface1;

public class Briyani 
{
	String type="chicken";
	int price = 200;
	Briyani(){}
	Briyani(String type, int price)
	{
		this.type=type;
		this.price=price;
	}
	public void briyaniDetails()
	{
		System.out.println(type);
		System.out.println(price);
	}
	public String toString()
	{
		return "type : " +type+ "price : " + price;
	}
}
