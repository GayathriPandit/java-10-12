package nonStaticMembers;

public class ChocolateDriver 
{
	public static void main(String[] args)
	{
		Chocolate c1=new Chocolate();
		c1.name="Dairy Milk";
		c1.price = 5;
		c1.color="Purple";
		c1.qty=2;
		c1.chocolateDetails();
		Chocolate c2=new Chocolate();
		c2.name="kit kat";
		c2.price = 10;
		c2.color="Red";
		c2.qty=2;
		c2.chocolateDetails();
		Chocolate c3=new Chocolate();
		c3.name="Eclairs";
		c3.price = 2;
		c3.color="Purple";
		c3.qty=5;
		c3.chocolateDetails();
		Chocolate c4=new Chocolate();
		c4.name="Milky Bar";
		c4.price = 10;
		c4.color="White";
		c4.qty=1;
		c4.chocolateDetails();
		Chocolate c5=new Chocolate();
		c5.name="Munch";
		c5.price = 15;
		c5.color="Blue";
		c5.qty=4;
		c5.chocolateDetails();
				
	}

}
