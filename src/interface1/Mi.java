package interface1;

public class Mi implements Mobile,Laptop 
{
	public void quality()
	{
		System.out.println("quality is good");
	}
	@Override
public void ram()
{
		System.out.println("ram is 8gb");
}@Override
public void brand()
{
	System.out.println("brand is mi");
}@Override
public void color() 
{
System.out.println("color is grey");	
}
}
