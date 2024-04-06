package inheritance;

public class ChocolateDriver
{
	public static void main(String[] args) {
		Chocolate c1=new Chocolate();
		c1.chocolateDetails();
		Chocolate c2=new Chocolate("dairymilk",30);
		c2.chocolateDetails();
		System.out.println("======");
		System.out.println(c1);
		System.out.println(c2);
	}

}
