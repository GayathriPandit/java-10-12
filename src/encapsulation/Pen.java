package encapsulation;

public class Pen 
{
	private String brand;
	private int price;
	private String color;
	private boolean refill;
	
	public String getBrand() {
		return brand;
	}
	public int getPrice()
	{
		return price;
	}
	public String getColor()
	{
		return color;
	}
	public boolean getRefill() 
	{
		return refill;
	}
	public void setBrand(String brand)
	{
		this.brand=brand;
	}
	public void setPrice(int price)
	{
		this.price=price;
	}
	public void setColor(String color)
	{
		this.color=color;
	}
	public void setRefill(boolean refill)
	{
		this.refill=refill;
	}
}
