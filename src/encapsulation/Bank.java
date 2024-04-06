package encapsulation;

public class Bank 
{
	private String bname;
	private long accNo;
	private double bal;
	private String loc;
	
	public String getBname()
	{
		return bname;
	}
	public long getAccNo()
	{
		return accNo;
	}
	public double getBal() 
	{
		return bal;
	}
	public String getLoc()
	{
		return loc;
	}
	public void setBname(String bname)
	{
		this.bname=bname;
	}
	public void setAccNo(long accNo)
	{
		this.accNo=accNo;
	}
	public void setBal(double bal)
	{
		this.bal=bal;
	}
	public void setLoc(String loc)
	{
		this.loc=loc;
	}
}
