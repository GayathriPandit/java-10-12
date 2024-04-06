package encapsulation;

public class Employee 
{
	private String ename;
	private int id;
	private String dept;
	private double sal;
	
	public String getEname()
	{
		return ename;
	}
	public int getId()
	{
		return id;
		
	}
	public String getDept()
	{
		return dept;
	}
	public double getSal() {
		return sal;
	}
	public void setEname(String ename)
	{
		this.ename=ename;
	}
	public void setId(int id)
	{
		this.id=id;
	}
	public void setDept(String dept)
	{
		this.dept=dept;
	}
	public void setSal(double sal)
	{
		this.sal=sal;
	}
}
