package part3;

public class Mobile 
{
	String brand ="Samsung";
	String colour ="blue";
	double price;
	{
		System.out.println("non static block");
	}
	
	public void display()
	{
		System.out.println("brand is :" +brand);
		System.out.println("colour is ; "+colour);
		System.out.println("price is : " +price);
	}
	
	public static void main(String[] args) {
		Mobile m1=new Mobile();
		m1.display();
		Mobile m2 = new Mobile();
		m2.brand ="nokia";
		m2.colour="black";
		m2.price=69.36;
		m2.display();
	}

}
