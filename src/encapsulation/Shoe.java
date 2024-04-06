package encapsulation;

public class Shoe
{
	private String brand;
	private String color;
	private int size;
	private int price;
	
	public String getBrand()
	{
		return brand;
	}
	public String getColor()
	{
		return color;
	}
	public int getSize()
	{
		return size;
	}
	public int getPrice()
	{
		return price;
	}
	public void setBrand(String brand)
	{
		this.brand=brand;
	}
	public void setColor(String color)
	{
		this.color=color;
	}
	public void setSize(int size)
	{
		this.size=size;
	}
	public void setPrice(int price)
	{
		this.price=price;
	}

}
