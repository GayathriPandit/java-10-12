package encapsulation;

public class Movie 
{
	private int price=200;//500
	private String mname= "animal";//leo
	//getters
	public int getPrice()
	{
		return price;
	}
	public String getMname()
	{
		return mname;
	}
	//setter
	public void setPrice(int price)
	{
		this.price=price;
	}
	public void setMname(String mname)
	{
		this.mname=mname;
	}
}
