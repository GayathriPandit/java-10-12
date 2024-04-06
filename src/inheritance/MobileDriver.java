package inheritance;

public class MobileDriver {

	public static void main(String[] args) 
	{
		Moblie m=new Moblie();
		System.out.println(m.brand);
		m.mobileDetails();
		System.out.println("========");
		Mi mi=new Mi();
		System.out.println(mi.price);
		System.out.println(mi.brand);
		mi.miDetails();
		mi.mobileDetails();

	}

}
